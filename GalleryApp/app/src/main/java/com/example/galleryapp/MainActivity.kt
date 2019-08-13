package com.example.galleryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageView0 = ImageView(this)
        var imageView1 = ImageView(this)
        var imageView2 = ImageView(this)
        var imageView3 = ImageView(this)
        var imageView4 = ImageView(this)
        var imageView5 = ImageView(this)
        var imageView6 = ImageView(this)
        var imageView7 = ImageView(this)
        var imageView8 = ImageView(this)
        var imageView9 = ImageView(this)

        var imageViews: Array<ImageView> = arrayOf(
            imageView0, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6,
            imageView7, imageView8, imageView9
        )

        imageViews[0].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.adventure_automobile_classic_2533092))
        imageViews[1].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.afterglow_beach_cliff_2555285))
        imageViews[2].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.alley_architecture_buildings_2526517))
        imageViews[3].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.architectural_design_architecture_bridge_2540653))
        imageViews[4].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.beautiful_breathtaking_canada_day_2526105))
        imageViews[5].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.bloom_blossom_flora_2567011))
        imageViews[6].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.close_up_colorful_colors_2529148))
        imageViews[7].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.clouds_coconut_trees_daylight_2486168))
        imageViews[8].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.colorful_colourful_houses_2501965))
        imageViews[9].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.wallpaper_astronomy_astrophotography_2538107))

        imageViews[0].contentDescription = getString(R.string.automobile)
        imageViews[1].contentDescription = getString(R.string.smooth_cliff)
        imageViews[2].contentDescription = getString(R.string.alley)
        imageViews[3].contentDescription = getString(R.string.vegas_night)
        imageViews[4].contentDescription = getString(R.string.fireworks)
        imageViews[5].contentDescription = getString(R.string.rose)
        imageViews[6].contentDescription = getString(R.string.shoes)
        imageViews[7].contentDescription = getString(R.string.palm_leaves)
        imageViews[8].contentDescription = getString(R.string.roof_tops)
        imageViews[9].contentDescription = getString(R.string.outer_space)

//        <style name="ImageStyle">
//        <item name="android:padding">10dp</item>
//        <item name="android:adjustViewBounds">true</item>
//        <item name="android:layout_width">match_parent</item>
//        <item name="android:layout_height">wrap_content</item>
//        <item name="android:scaleType">fitCenter</item>

        val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        var i = 0
        imageViews.forEach {
            it.adjustViewBounds = true
            it.setPadding(10, 10, 10, 10)
            it.layoutParams = layoutParams
            it.scaleType = ImageView.ScaleType.FIT_CENTER

            if (i++ < imageViews.size / 2) {
                left_column.addView(it)
            } else {
                right_column.addView(it)
            }
        }
    }
}