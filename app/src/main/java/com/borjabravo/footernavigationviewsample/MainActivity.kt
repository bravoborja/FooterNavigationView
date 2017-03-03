package com.borjabravo.footernavigationviewsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.widget.DrawerLayout
import android.support.v7.widget.Toolbar
import android.view.Gravity
import android.view.MenuItem
import com.borjabravo.footernavigationview.FooterNavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private var drawerLayout: DrawerLayout? = null
    private var footerNavigationView: FooterNavigationView? = null

    internal var optionSelected = R.id.menu_add

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerLayout = findViewById(R.id.drawerLayout) as DrawerLayout
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        toolbar.setNavigationIcon(R.drawable.ic_menu)
        toolbar.setNavigationOnClickListener { drawerLayout?.openDrawer(Gravity.START) }
        footerNavigationView = findViewById(R.id.footer_navigation_view) as FooterNavigationView
        footerNavigationView?.setCheckedItem(optionSelected)
        footerNavigationView?.navigationView?.menu?.performIdentifierAction(optionSelected, 0)
        footerNavigationView?.setNavigationListener(this)
    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        drawerLayout?.closeDrawers()
        optionSelected = menuItem.itemId
        return true
    }
}