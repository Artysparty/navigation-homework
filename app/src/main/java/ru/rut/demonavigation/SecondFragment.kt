package ru.rut.demonavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class SecondFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val second_view = inflater.inflate(R.layout.fragment_second, container, false)
//        val go_to_first_button = second_view.findViewById<Button>(R.id.go_to_first_button)
//        go_to_first_button.setOnClickListener {
//            findNavController().navigate(
//                R.id.action_secondFragment_to_firstFragment,
//                null,
//                navOptions {
//                    anim {
//                        enter = R.anim.fade_in
//                        exit = R.anim.slide_out
//                    }
//                }
//            )
//        }
        val go_to_third_button = second_view.findViewById<Button>(R.id.go_to_third_button)
        go_to_third_button.setOnClickListener {
            findNavController().navigate(
                R.id.action_secondFragment_to_thirdFragment,
                null,
                navOptions {
                    anim {
                        enter = R.anim.fade_in
                        exit = R.anim.slide_out
                    }
                }
            )
        }
        return second_view
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SecondFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}