package az.zero.navigationcomponent_cat.ui.fragment.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import az.zero.navigationcomponent_cat.R;


public class LoginFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button sendBtn = view.findViewById(R.id.btn_send);
        EditText edUsername = view.findViewById(R.id.ed_username);
        EditText edPassword = view.findViewById(R.id.ed_password);

        sendBtn.setOnClickListener(v -> {
            String username = edUsername.getText().toString();
            String password = edPassword.getText().toString();

            NavDirections action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(username, password);
            Navigation.findNavController(view).navigate(action);
        });

    }
}
