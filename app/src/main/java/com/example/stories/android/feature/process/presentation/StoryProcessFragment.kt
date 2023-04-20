package com.example.stories.android.feature.process.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.stories.android.common.design.colors.AppColors
import com.example.stories.android.feature.common.domain.GetKey
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
internal class StoryProcessFragment : Fragment() {

    @Inject
    lateinit var keyGetter: GetKey

    private var fullScreenAd: InterstitialAd? = null
    private val fullScreenContentCallback = object : FullScreenContentCallback() {
        override fun onAdClicked() {}

        override fun onAdDismissedFullScreenContent() {
            fullScreenAd = null
            loadAd()
        }

        override fun onAdFailedToShowFullScreenContent(adError: AdError) {
            fullScreenAd = null
            loadAd()
        }

        override fun onAdImpression() {}

        override fun onAdShowedFullScreenContent() {}
    }

    /*private var iapConnector: IapConnector? = null
    private val purchaseServiceListener = object : PurchaseServiceListener {
        override fun onPricesUpdated(iapKeyPrices: Map<String, DataWrappers.ProductDetails>) {
            viewModel.updatePrice(
                requireNotNull(iapKeyPrices[purchaseKey])
            )
        }

        override fun onProductPurchased(purchaseInfo: DataWrappers.PurchaseInfo) {
            viewModel.onPaymentConfirmed()
        }

        override fun onProductRestored(purchaseInfo: DataWrappers.PurchaseInfo) {}
    }*/


    private val viewModel: StoryProcessViewModel by viewModels()

    companion object {
        //private const val purchaseKey = "disabling_ads"
        fun newInstance(storyId: String): Fragment =
            StoryProcessFragment().apply {
                arguments = bundleOf(
                    StoryProcessViewModel.STORY_ID to storyId
                )
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        loadAd()
        setIapConnector()
        return ComposeView(requireContext()).apply {
            setContent {
                MaterialTheme {
                    Scaffold(
                        content = { padding ->
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(AppColors.BackgroundDark)
                                    .padding(padding)
                            ) {
                                ScreenContent()
                            }
                        }
                    )
                }
            }
        }
    }

    @Composable
    private fun ScreenContent() {
        StoryProcessScreen(
            viewModel = viewModel,
            showAd = {
                showAd()
            },
            startPayment = {
                startPayment()
            }
        )
    }

    private fun loadAd() {
        val adRequest = AdRequest.Builder().build()
        InterstitialAd.load(
            requireContext(),
            // Test ad id
            "ca-app-pub-3940256099942544/1033173712",
            adRequest,
            object : InterstitialAdLoadCallback() {
                override fun onAdFailedToLoad(adError: LoadAdError) {
                    fullScreenAd = null
                }

                override fun onAdLoaded(interstitialAd: InterstitialAd) {
                    fullScreenAd = interstitialAd
                    fullScreenAd?.fullScreenContentCallback = fullScreenContentCallback
                }
            }
        )
    }

    private fun setIapConnector() {
        /*iapConnector = IapConnector(
            context = requireActivity(),
            nonConsumableKeys = listOf(purchaseKey),
            key = keyGetter.getKey(),
            enableLogging = true
        )
        iapConnector?.addPurchaseListener(purchaseServiceListener)*/
    }

    private fun showAd() {
        fullScreenAd?.show(requireActivity())
    }

    private fun startPayment() {
        /*iapConnector?.purchase(
            requireActivity(),
            purchaseKey
        )*/
    }
}