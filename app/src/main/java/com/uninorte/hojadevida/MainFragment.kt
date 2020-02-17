package com.uninorte.hojadevida


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.uninorte.hojadevida.databinding.FragmentMainBinding

import com.uninorte.hojadevida.model.UserPersonalModel

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController
    lateinit var userPersonalModel: UserPersonalModel
    lateinit var mBinding : FragmentMainBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_main, container, false)
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        userPersonalModel = UserPersonalModel("Juanita Perez","Estudiando",20,"Ver TV", 2, R.mipmap.honoree_avatar)
       // mBinding = DataBindingUtil.setContentView(this.requireActivity(), R.layout.fragment_main)
        mBinding.user = userPersonalModel
        view.findViewById<Button>(R.id.button_personal).setOnClickListener(this)
    }

    override fun onClick(v: View?) {

    }


}
