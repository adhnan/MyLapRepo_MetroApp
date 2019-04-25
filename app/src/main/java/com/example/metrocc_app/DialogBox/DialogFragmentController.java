package com.example.metrocc_app.DialogBox;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.metrocc_app.R;

public class DialogFragmentController extends DialogFragment {

    public static DialogFragmentController newInstance(String title, String content) {
        DialogFragmentController f = new DialogFragmentController();
        Bundle args = new Bundle();
        args.putString("title", title);
        args.putString("content", content);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_AppCompat_DayNight_Dialog_Alert);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_view, container, false);

        Button btnContinue = (Button) v.findViewById(R.id.btnContinue);
        Button btnGoBack = (Button) v.findViewById(R.id.btnGoBack);
        TextView title = v.findViewById(R.id.tvForgotpassword);
        TextView content = v.findViewById(R.id.tvForgotPasswordContent);

        if (getArguments() != null) {
            title.setText(getArguments().getString("title"));
            content.setText(getArguments().getString("content"));
            if (title.getText().toString().equals("Forgot Password")) {
                title.setTextColor(Color.YELLOW);
                btnContinue.setVisibility(View.GONE);
            }
        }
        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return v;
    }
}
