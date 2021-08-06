package az.zero.navigationcomponent_cat.ui.fragment.bottom;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import az.zero.navigationcomponent_cat.R;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button loginBtn = view.findViewById(R.id.btn_go_to_login);

        loginBtn.setOnClickListener(v -> {
            NavDirections action = HomeFragmentDirections.actionHomeFragmentToLoginFragment();
            Navigation.findNavController(view).navigate(action);
        });

    }
}
