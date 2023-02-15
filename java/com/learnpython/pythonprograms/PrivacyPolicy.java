package com.learnpython.pythonprograms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class PrivacyPolicy extends AppCompatActivity {

    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7;
    TextView textView8,textView9,textView10,textView11,textView12,textView13,textView14;
    TextView textView15,textView16,textView17,textView18,textView19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Privacy Policy");
        actionBar.setDisplayHomeAsUpEnabled(true);

        String string1 = "Python Programs app is a Free app. This SERVICE is provided at no cost and is intended for use as is.\n" +
                "\n" +
                "This page is used to inform visitors regarding my policies with the collection, use, and disclosure of Personal Information if anyone decided to use my Service.\n" +
                "\n" +
                "If you choose to use my Service, then you agree to the collection and use of information in relation to this policy. The Personal Information that I collect is used for providing and improving the Service. I will not use or share your information with anyone except as described in this Privacy Policy.\n" +
                "\n" +
                "The terms used in this Privacy Policy have the same meanings as in our Terms and Conditions, which are accessible at Python Programs unless otherwise defined in this Privacy Policy.";
        textView1 = findViewById(R.id.Privacy_Policy_Part);
        textView1.setText(string1);

        String string2 = "Information Collection and Use";
        textView2 = findViewById(R.id.Information_Collection_and_Use);
        textView2.setText(string2);
        String string3 = "For a better experience, while using our Service, I may require you to provide us with certain personally identifiable information, including but not limited to Nothing. The information that I request will be retained on your device and is not collected by me in any way.\n" +
                "\n" +
                "The app does use third-party services that may collect information used to identify you.\n" +
                "\n" +
                "Link to the privacy policy of third-party service providers used by the app\n" +
                "\n" +
                "Google Play Services\n" +
                "AdMob\n" +
                "Google Analytics for Firebase";
        SpannableString Google_Play_Services = new SpannableString(string3);
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Uri uri = Uri.parse("https://www.google.com/policies/privacy/");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.rgb(0,0,255));
              }
        };
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Uri uri = Uri.parse("https://support.google.com/admob/answer/6128543?hl=en");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.rgb(0,0,255));
            }
        };
        ClickableSpan clickableSpan3 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Uri uri = Uri.parse("https://firebase.google.com/policies/analytics");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.rgb(0,0,255));
            }
        };
        Google_Play_Services.setSpan(clickableSpan1,438,460, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        Google_Play_Services.setSpan(clickableSpan2,461,466, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        Google_Play_Services.setSpan(clickableSpan3,467,496, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView3 = findViewById(R.id.Information_Collection_and_Use_Part);
        textView3.setText(Google_Play_Services);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());


        String string4 = "Log Data";
        textView4 = findViewById(R.id.Log_Data);
        textView4.setText(string4);

        String string5 = "I want to inform you that whenever you use my Service, in a case of an error in the app I collect data and information (through third-party products) on your phone called Log Data. This Log Data may include information such as your device Internet Protocol (“IP”) address, device name, operating system version, the configuration of the app when utilizing my Service, the time and date of your use of the Service, and other statistics.";
        textView5 = findViewById(R.id.Log_Data_Part);
        textView5.setText(string5);

        String string6 = "Cookies";
        textView6 = findViewById(R.id.Cookies);
        textView6.setText(string6);

        String string7 = "Cookies are files with a small amount of data that are commonly used as anonymous unique identifiers. These are sent to your browser from the websites that you visit and are stored on your device's internal memory.\n" +
                "\n" +
                "This Service does not use these “cookies” explicitly. However, the app may use third-party code and libraries that use “cookies” to collect information and improve their services. You have the option to either accept or refuse these cookies and know when a cookie is being sent to your device. If you choose to refuse our cookies, you may not be able to use some portions of this Service.";
        textView7 = findViewById(R.id.Cookies_Part);
        textView7.setText(string7);

        String string8 = "Service Providers";
        textView8 = findViewById(R.id.Service_Providers);
        textView8.setText(string8);

        String string9 = "I may employ third-party companies and individuals due to the following reasons:\n" +
                "\n" +
                "To facilitate our Service;\n" +
                "To provide the Service on our behalf;\n" +
                "To perform Service-related services; or\n" +
                "To assist us in analyzing how our Service is used.\n" +
                "I want to inform users of this Service that these third parties have access to their Personal Information. The reason is to perform the tasks assigned to them on our behalf. However, they are obligated not to disclose or use the information for any other purpose.";
        textView9 = findViewById(R.id.Service_Providers_Part);
        textView9.setText(string9);

        String string10 = "Security";
        textView10 = findViewById(R.id.Security);
        textView10.setText(string10);

        String string11 = "I value your trust in providing us your Personal Information, thus we are striving to use commercially acceptable means of protecting it. But remember that no method of transmission over the internet, or method of electronic storage is 100% secure and reliable, and I cannot guarantee its absolute security.";
        textView11 = findViewById(R.id.Security_Part);
        textView11.setText(string11);

        String string12 = "Links to Other Sites";
        textView12 = findViewById(R.id.Links_to_Other_Sites);
        textView12.setText(string12);

        String string13 = "This Service may contain links to other sites. If you click on a third-party link, you will be directed to that site. Note that these external sites are not operated by me. Therefore, I strongly advise you to review the Privacy Policy of these websites. I have no control over and assume no responsibility for the content, privacy policies, or practices of any third-party sites or services.";
        textView13 = findViewById(R.id.Links_to_Other_Sites_Part);
        textView13.setText(string13);

        String string14 = "Children’s Privacy";
        textView14 = findViewById(R.id.Children_Privacy);
        textView14.setText(string14);

        String string15 = "These Services do not address anyone under the age of 13. I do not knowingly collect personally identifiable information from children under 13 years of age. In the case I discover that a child under 13 has provided me with personal information, I immediately delete this from our servers. If you are a parent or guardian and you are aware that your child has provided us with personal information, please contact me so that I will be able to do the necessary actions.";
        textView15 = findViewById(R.id.Children_Privacy_Part);
        textView15.setText(string15);

        String string16 = "Changes to This Privacy Policy";
        textView16 = findViewById(R.id.Changes_to_This_Privacy_Policy);
        textView16.setText(string16);

        String string17 = "I may update our Privacy Policy from time to time. Thus, you are advised to review this page periodically for any changes. I will notify you of any changes by posting the new Privacy Policy on this page.\n" +
                "\n" +
                "This policy is effective as of 2021-12-03";
        textView17 = findViewById(R.id.Changes_to_This_Privacy_Policy_Part);
        textView17.setText(string17);

        String string18 = "Contact Us";
        textView18 = findViewById(R.id.Contact_Us);
        textView18.setText(string18);

        String string19 = "If you have any questions or suggestions about my Privacy Policy, do not hesitate to contact me at infopythonprograms@gmail.com.";
        SpannableString Contact_Us = new SpannableString(string19);
        ClickableSpan clickableSpan4 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:infopythonprograms@gmail.com"));
                startActivity(intent);
            }
            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.rgb(0,0,255));
            }
        };
        Contact_Us.setSpan(clickableSpan4,99,128, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView19 = findViewById(R.id.Contact_Us_Part);
        textView19.setText(Contact_Us);
        textView19.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}