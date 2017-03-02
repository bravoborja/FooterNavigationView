package com.borjabravo.footernavigationview

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.support.annotation.IdRes
import android.support.design.widget.NavigationView
import android.support.v4.widget.NestedScrollView
import android.util.AttributeSet
import android.view.View
import android.view.ViewStub

class FooterNavigationView : NestedScrollView {

    var navigationView: NavigationView? = null
        private set
    var menu: Int = 0
    var headerLayout: Int = 0
    var footerLayout: Int = 0
    var itemIconTint: ColorStateList? = null
        set(value) {
            navigationView?.itemIconTintList = value
        }
    var itemTextColor: ColorStateList? = null
        set(value) {
            navigationView?.itemTextColor = value
        }
    var itemBackground: Drawable? = null
        set(value) {
            navigationView?.itemBackground = value
        }

    constructor(context: Context) : super(context) {
            init(context, null)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
            init(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
            init(context, attrs)
    }

    private fun init(context: Context, attrs: AttributeSet?) {
        View.inflate(getContext(), R.layout.footer_navigation_view, this)
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.FooterNavigationView)
        this.navigationView = findViewById(R.id.nav_view) as NavigationView
        this.headerLayout = typedArray.getResourceId(R.styleable.FooterNavigationView_headerLayout, 0)
        this.menu = typedArray.getResourceId(R.styleable.FooterNavigationView_menu, 0)
        this.itemIconTint = typedArray.getColorStateList(R.styleable.FooterNavigationView_itemIconTint)
        this.itemTextColor = typedArray.getColorStateList(R.styleable.FooterNavigationView_itemTextColor)
        this.itemBackground = typedArray.getDrawable(R.styleable.FooterNavigationView_itemBackground)
        this.footerLayout = typedArray.getResourceId(R.styleable.FooterNavigationView_footerLayout, 0)
        val viewStub = findViewById(R.id.footer) as ViewStub

        navigationView?.inflateHeaderView(headerLayout)
        navigationView?.inflateMenu(menu)
        viewStub.layoutResource = footerLayout
        viewStub.inflate()
        typedArray.recycle()
    }

    fun setNavigationListener(listener: NavigationView.OnNavigationItemSelectedListener) {
        navigationView?.setNavigationItemSelectedListener(listener)
    }

    fun setCheckedItem(@IdRes id: Int) {
        navigationView?.setCheckedItem(id)
    }
}