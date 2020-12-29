package com.datenight_immersia_ltd.views.datehub_navigation.ui_fragments.help;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.datenight_immersia_ltd.R;

import java.util.HashMap;
import java.util.Map;

public class HelpFragment extends Fragment {
    CardView reportIssue, faq, improvement, tweet;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_help, container, false);
        reportIssue = view.findViewById(R.id.report_issue);
        faq = view.findViewById(R.id.faq);
        improvement = view.findViewById(R.id.suggest_improvement);
        tweet = view.findViewById(R.id.tweet);

        reportIssue.setOnClickListener(v->{reportAnIssue();});
        improvement.setOnClickListener(v->{suggestImprovement();});
        tweet.setOnClickListener(v->{tweet();});

        return view;
    }

    public void reportAnIssue(){
        Intent intent = new Intent(requireContext(), ReportIssue.class);
        startActivity(intent);
    }

    public void suggestImprovement(){
        Intent intent = new Intent(requireContext(), SuggestImprovement.class);
        startActivity(intent);
    }

    public void tweet(){
        Toast.makeText(requireContext(),"Tweet about us ?", Toast.LENGTH_SHORT).show();
    }
}