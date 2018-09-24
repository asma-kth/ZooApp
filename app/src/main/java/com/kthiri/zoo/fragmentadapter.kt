package com.kthiri.zoo

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


class fragmentadapter(fragmentManager: FragmentManager):FragmentPagerAdapter(fragmentManager) {



    override fun getItem(po: Int): Fragment {
        return when (po){
            0 -> monkeyFragment.newInstance()
            1 -> lionFragment.newInstance()
            2-> giraffeFragment.newInstance()
            3-> tigerfragment.newInstance()
            4 -> zebrafragment.newInstance()
            5-> elephantfragment.newInstance()
            6-> bearfragment.newInstance()
            7-> camelfragment.newInstance()
             else-> monkeyFragment.newInstance()

        }

    }
    override fun getCount() = 8

}