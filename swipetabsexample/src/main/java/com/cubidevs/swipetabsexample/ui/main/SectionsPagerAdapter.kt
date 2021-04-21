package com.cubidevs.swipetabsexample.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.cubidevs.swipetabsexample.*

private val TAB_TITLES = arrayOf(
    R.string.title_batman,
    R.string.title_flash,
    R.string.title_superman,
    R.string.title_wonder_woman
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return BatmanFragment()
            1 -> return FlashFragment()
            2 -> return SupermanFragment()
            else -> return WonderWomanFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int = 4
}