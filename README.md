# FooterNavigationView

[![](https://jitpack.io/v/borjabravo10/FooterNavigationView.svg)](https://jitpack.io/#borjabravo10/FooterNavigationView)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-SimpleRatingBar-green.svg?style=true)](https://android-arsenal.com/details/1/5401)
[![Kotlin Weekly](http://img.shields.io/badge/Kotlin%20Weekly-%2331-2CB3E5.svg?style=flat)](http://us12.campaign-archive1.com/?u=f39692e245b94f7fb693b6d82&id=6605c39b6f&e=[UNIQID])

FooterNavigationView helps to show a footer inside the NavigationView.

## Download
To add the FooterNavigationView library to your Android Studio project, simply add the following gradle dependency:
```java
compile 'com.borjabravo:footernavigationview:1.0.0'
```

## Usage

To use the FooterNavigationView on your app, add the following code to your layout:

```xml
<com.borjabravo.footernavigationview.FooterNavigationView
    android:id="@+id/footer_navigation_view"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:itemTextColor="@color/text_color_footer_navigation_view"    
    app:itemBackground="@drawable/bg_item_footer_navigation_view"   
    app:itemIconTint="@color/ic_tint_footer_navigation_view"        
    app:menu="@menu/menu_layout"
    app:headerLayout="@layout/header_layout"
    app:footerLayout="@layout/footer_layout"/>
```    
All properties are the same than NavigationView, excepts the footerLayout. This property allows us to show a footer inside the NavigationView. Our custom view has scroll to see all contents.

![FooterNavigationView](FooterNavigationView.png)

License
=======

    Copyright 2017 Borja Bravo Álvarez

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
