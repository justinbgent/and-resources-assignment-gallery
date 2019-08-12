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

        val imageViews: ArrayList<ImageView> = ArrayList(10)
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

            if (i++ < imageViews.size / 2){
                left_column.addView(it)
            }else{
                right_column.addView(it)
            }
        }
    }
}