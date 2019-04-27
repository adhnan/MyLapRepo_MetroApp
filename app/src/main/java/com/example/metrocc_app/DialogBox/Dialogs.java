package com.example.metrocc_app.DialogBox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class Dialogs extends AppCompatActivity {

    public void showPopup(int num) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Fragment prev = getSupportFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);


        switch (num) {

            // Create and show the dialog.
            case 1:
                DialogFragment newFragment1 = DialogFragmentController.newInstance("Forgot Password", "Contact the IT support desk for resetting your password",1);
                newFragment1.show(ft, "dialog");
                break;

            case 2:
                DialogFragment newFragment2 = DialogFragmentController.newInstance("Pause Session", "You have items in the cart.Do you want to pause your current session or end the session?",2);
                newFragment2.show(ft, "dialog");
                break;

            case 3:
                DialogFragment newFragment3 = DialogFragmentController.newInstance("Confirm Delete", "This action cannot be reversed.\n" + "Are you sure you want to delete all 12 items from Beverages?",3);
                newFragment3.show(ft, "dialog");
                break;

            case 4:
                DialogFragment newFragment4 = DialogFragmentController.newInstance("Not in PJP", "This customer is not in your PJP for today. Are you sure you want to continue?",4);
                newFragment4.show(ft, "dialog");
                break;

            case 5:
                DialogFragment newFragment5 = DialogFragmentController.newInstance("Capture Geo-Location", "This customer is not geo-Tagged.Do you want to capture the geolocation before continuing?",5);
                newFragment5.show(ft, "dialog");
                break;

            case 6:
                DialogFragment newFragment6 = DialogFragmentController.newInstance("Incorrect Location", "You are not at the selected customer's location. Do you want to continue?",6);
                newFragment6.show(ft, "dialog");
                break;

            case 7:
                DialogFragment newFragment7 = DialogFragmentController.newInstance("Card Swipe", "Is the card swipe successful?\n" + "Transaction ID?",7);
                newFragment7.show(ft, "dialog");
                break;

            case 8:
                DialogFragment newFragment8 = DialogFragmentController.newInstance("Stock Info", "On Order:20,000 on May 5, 2019",8);
                newFragment8.show(ft, "dialog");
                break;

            case 9:
                DialogFragment newFragment9 = DialogFragmentController.newInstance("Insufficient Stock", "The stock that you have entered is not available. Please re-enter the stock.\n" + "current stock:20,000",9);
                newFragment9.show(ft, "dialog");
                break;

            case 10:
                DialogFragment newFragment10 = DialogFragmentController.newInstance("Take Order", "You already have an active session. \n" + "Do you want to continue your previous session or take a new order?",10);
                newFragment10.show(ft, "dialog");
                break;

            case 11:
                DialogFragment newFragment11 = DialogFragmentController.newInstance("Info", "In Stock: 10,000. \n" + " On Order:20,000 on May 5,2019",11);
                newFragment11.show(ft, "dialog");
                break;
        }

    }

}
