package az.zero.navigationcomponent_cat.ui.fragment.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import az.zero.navigationcomponent_cat.R;


public class WelcomeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_welcome, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String username = WelcomeFragmentArgs.fromBundle(getArguments()).getUsername();
        String password = WelcomeFragmentArgs.fromBundle(getArguments()).getPassword();

        TextView tvUsername = view.findViewById(R.id.tv_username);
        TextView tvPassword = view.findViewById(R.id.tv_password);

        tvUsername.setText(username);
        tvPassword.setText(password);


    }
}
