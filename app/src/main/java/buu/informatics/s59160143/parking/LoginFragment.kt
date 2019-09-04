package buu.informatics.s59160143.parking


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.informatics.s59160143.parking.databinding.FragmentLoginBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false)
        binding.buttonClick.setOnClickListener { view ->
            binding.apply {
                var username = usernameEditText.text.toString()
                var password = passwordEditText.text.toString()
                if(username.equals("admin") && password.equals("12345678")){
                    view.findNavController().navigate(R.id.toParking)
                }else{
//                    warningText.text = "Username or Password is not Match!!"
//                    warningText.visibility = View.VISIBLE
                }
            }
        }
        setHasOptionsMenu(true)
        return binding.root
    }


}
