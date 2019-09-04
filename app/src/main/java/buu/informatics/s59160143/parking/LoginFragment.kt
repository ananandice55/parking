package buu.informatics.s59160143.parking


import android.app.AlertDialog
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import buu.informatics.s59160143.parking.databinding.FragmentLoginBinding
import android.R.string.cancel
import android.content.DialogInterface




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
                    val builder1 = AlertDialog.Builder(context)
                    builder1.setMessage("try again")
                    builder1.setCancelable(true)

                    builder1.setPositiveButton(
                        "OK"
                    ) { dialog, id -> dialog.cancel() }


                    val alert11 = builder1.create()
                    alert11.show()
                }
            }
        }
        setHasOptionsMenu(true)
        return binding.root
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.about, menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }


}
