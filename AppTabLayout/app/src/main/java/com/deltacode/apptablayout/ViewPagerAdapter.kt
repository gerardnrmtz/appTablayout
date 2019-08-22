package com.deltacode.apptablayout

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    var fragmentsList: ArrayList<Fragment>? = null
    var fragmentTitleList: ArrayList<String>? = null

    init {
        this.fragmentTitleList = ArrayList()
        this.fragmentsList = ArrayList()
    }

    override fun getItem(p0: Int): Fragment {
        return fragmentsList?.get(p0)!!
    }

    override fun getCount(): Int {
        return fragmentsList?.size!!
    }

    fun addFragment(fragment: Fragment, title: String) {
        fragmentsList?.add(fragment)
        fragmentTitleList?.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitleList?.get(position)!!
    }

}