package net.reader128k.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import net.reader128k.databinding.FragmentLoginBinding

@AndroidEntryPoint
class LoginFragment : Fragment() {
    private val viewModel by viewModels<LoginViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.apply {
            btnLogin.setOnClickListener {
                val username = binding.etLogin.text.toString()
                val password = binding.etPassword.text.toString()
                viewModel.loginResponse.observe(viewLifecycleOwner) { result ->
                    Toast.makeText(requireContext(), "Login: $result", Toast.LENGTH_SHORT).show()
                }
                viewModel.login(username, password)
            }
        }
        return binding.root
    }
}