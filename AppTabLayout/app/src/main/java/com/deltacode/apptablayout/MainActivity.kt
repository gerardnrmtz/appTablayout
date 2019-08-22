package com.deltacode.apptablayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var viewPager: ViewPager? = null
    var tablayout: TabLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)
        tablayout = findViewById(R.id.tabs)

        configurarViewPager()
        tablayout?.setupWithViewPager(viewPager)

        configurarIconos()
    }

    fun configurarViewPager() {

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(Fragmento01(), "Fragmento 1")
        adapter.addFragment(Fragmento01(), "Fragmento 2")
        adapter.addFragment(Fragmento01(), "Fragmento 3")
        viewPager?.adapter = adapter
    }
    fun configurarIconos(){
        tablayout?.getTabAt(0)!!.setIcon(R.drawable.ic_audiotrack_black_24dp)
        tablayout?.getTabAt(1)!!.setIcon(R.drawable.ic_launcher_background)
        tablayout?.getTabAt(2)!!.setIcon(R.drawable.ic_backup_black_24dp)
    }
}
