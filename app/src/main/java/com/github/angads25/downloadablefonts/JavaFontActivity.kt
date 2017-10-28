package com.github.angads25.downloadablefonts

import android.graphics.Typeface
import android.os.Bundle
import android.os.Handler
import android.support.v4.provider.FontRequest
import android.support.v4.provider.FontsContractCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatTextView

/**<p>
 * Created by Angad on 28-10-2017.
 * </p>
 */

class JavaFontActivity : AppCompatActivity() {
    private var light: AppCompatTextView? = null
    private var regular: AppCompatTextView? = null
    private var semiBold: AppCompatTextView? = null
    private var bold: AppCompatTextView? = null
    private var extraBold: AppCompatTextView? = null
    private var condensedBold: AppCompatTextView? = null

    private val certificate = R.array.com_google_android_gms_fonts_certs

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_labels_no_fonts)

        light = findViewById(R.id.tv_light)
        regular = findViewById(R.id.tv_regular)
        semiBold = findViewById(R.id.tv_semi_bold)
        bold = findViewById(R.id.tv_bold)
        extraBold = findViewById(R.id.tv_extra_bold)
        condensedBold = findViewById(R.id.tv_condensed_bold)

        val sansRegularRequest = FontRequest(Companion.PROVIDER_AUTHORITY, PROVIDER_PACKAGE, "Open Sans", certificate)
        val sansRegularCallback = object : FontsContractCompat.FontRequestCallback() {
            override fun onTypefaceRetrieved(typeface: Typeface?) {
                regular!!.typeface = typeface
            }

            override fun onTypefaceRequestFailed(reason: Int) {}
        }
        FontsContractCompat.requestFont(this, sansRegularRequest, sansRegularCallback, Handler())

        val sansLightRequest = FontRequest(Companion.PROVIDER_AUTHORITY, PROVIDER_PACKAGE, "name=Open Sans&weight=300", certificate)
        val sansLightCallback = object : FontsContractCompat.FontRequestCallback() {
            override fun onTypefaceRetrieved(typeface: Typeface?) {
                light!!.typeface = typeface
            }

            override fun onTypefaceRequestFailed(reason: Int) {}
        }
        FontsContractCompat.requestFont(this, sansLightRequest, sansLightCallback, Handler())

        val sansSemiBoldRequest = FontRequest(Companion.PROVIDER_AUTHORITY, PROVIDER_PACKAGE, "name=Open Sans&weight=600", certificate)
        val sansSemiBoldCallback = object : FontsContractCompat.FontRequestCallback() {
            override fun onTypefaceRetrieved(typeface: Typeface?) {
                semiBold!!.typeface = typeface
            }

            override fun onTypefaceRequestFailed(reason: Int) {}
        }
        FontsContractCompat.requestFont(this, sansSemiBoldRequest, sansSemiBoldCallback, Handler())

        val sansBoldRequest = FontRequest(Companion.PROVIDER_AUTHORITY, PROVIDER_PACKAGE, "name=Open Sans&weight=700", certificate)
        val sansBoldCallback = object : FontsContractCompat.FontRequestCallback() {
            override fun onTypefaceRetrieved(typeface: Typeface?) {
                bold!!.typeface = typeface
            }

            override fun onTypefaceRequestFailed(reason: Int) {}
        }
        FontsContractCompat.requestFont(this, sansBoldRequest, sansBoldCallback, Handler())

        val sansExtraBoldRequest = FontRequest(Companion.PROVIDER_AUTHORITY, PROVIDER_PACKAGE, "name=Open Sans&weight=800", certificate)
        val sansExtraBoldCallback = object : FontsContractCompat.FontRequestCallback() {
            override fun onTypefaceRetrieved(typeface: Typeface?) {
                extraBold!!.typeface = typeface
            }

            override fun onTypefaceRequestFailed(reason: Int) {}
        }
        FontsContractCompat.requestFont(this, sansExtraBoldRequest, sansExtraBoldCallback, Handler())

        val sansCondensedBoldRequest = FontRequest(Companion.PROVIDER_AUTHORITY, PROVIDER_PACKAGE, "name=Open Sans&weight=700&width=75", certificate)
        val sansCondensedBoldCallback = object : FontsContractCompat.FontRequestCallback() {
            override fun onTypefaceRetrieved(typeface: Typeface?) {
                condensedBold!!.typeface = typeface
            }

            override fun onTypefaceRequestFailed(reason: Int) {}
        }
        FontsContractCompat.requestFont(this, sansCondensedBoldRequest, sansCondensedBoldCallback, Handler())
    }

    companion object {
        private val PROVIDER_PACKAGE = "com.google.android.gms"
        private val PROVIDER_AUTHORITY = PROVIDER_PACKAGE + ".fonts"
    }
}
