package com.interswitchug.uitest.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.interswitchug.uitest.R
import com.interswitchug.uitest.data.adapters.MenuAdapter
import com.interswitchug.uitest.data.models.Menu
import com.interswitchug.uitest.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*MENU recyclerview set up*/
        binding.menuRv.adapter = MenuAdapter(requireActivity(), mutableListOf(
            Menu(1,"Airtime", R.drawable.ic_baseline_ad_units_100),
            Menu(2,"Utilities", R.drawable.icons8_paybills_100),
            Menu(3,"Buy Data", R.drawable.ic_baseline_swap_vertical_circle_100),
            Menu(4,"Pay TV", R.drawable.ic_baseline_live_tv_100),
            Menu(5,"Corporates", R.drawable.ic_baseline_business_center_100),
            Menu(6,"School Fees", R.drawable.ic_baseline_school_100),
            Menu(7,"Mobile Money", R.drawable.ic_baseline_mobile_screen_share_100),
        ))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}