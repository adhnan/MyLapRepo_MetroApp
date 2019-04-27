package com.example.metrocc_app.DialogBox;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.metrocc_app.R;

public class DialogFragmentController extends DialogFragment {

    public static DialogFragmentController newInstance(String title, String content, int DialogBoxNum) {
        DialogFragmentController f = new DialogFragmentController();
        Bundle args = new Bundle();
        args.putString("title", title);
        args.putString("content", content);
        args.putInt("num", DialogBoxNum);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_AppCompat_DayNight_Dialog_Alert);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_view, container, false);

        int dialogNum;
        Button btnLeft = (Button) v.findViewById(R.id.btnContinue);
        Button btnRight = (Button) v.findViewById(R.id.btnGoBack);
        TextView title = v.findViewById(R.id.tvForgotpassword);
        TextView content = v.findViewById(R.id.tvForgotPasswordContent);

        // Getting the arguments
        if (getArguments() == null) {
            throw new AssertionError();
        }

        dialogNum = getArguments().getInt("DialogBoxNum");
        title.setText(getArguments().getString("title"));
        content.setText(getArguments().getString("content"));

        switch (dialogNum) {


            case 1:
                title.setTextColor(Color.YELLOW);
                btnLeft.setVisibility(View.GONE);
                btnRight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                    }
                });
                break;

            case 2:
                title.setTextColor(Color.YELLOW);
                btnRight.setText("EndSession");
                btnRight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                    }
                });
                 break;

            case 3:


        }

        return v;
    }
}
