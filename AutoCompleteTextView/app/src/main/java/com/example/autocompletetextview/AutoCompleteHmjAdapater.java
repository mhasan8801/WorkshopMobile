package com.example.autocompletetextview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AutoCompleteHmjAdapater extends ArrayAdapter<HmjItem> {
    private List<HmjItem> hmjListFull;

    public AutoCompleteHmjAdapater(@NonNull Context context, @NonNull List<HmjItem> hmjList) {
        super(context, 0, hmjList);
        hmjListFull = new ArrayList<>(hmjList);
    }

    @NonNull
    @Override
    public Filter getFilter() {
        return hmjFilter;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.hmj_autocomplete_row, parent, false
            );
        }

        TextView textViewName = convertView.findViewById(R.id.text_view_name);
        ImageView imageViewFlag = convertView.findViewById(R.id.image_view_hmj);

        HmjItem hmjItem = getItem(position);

        if (hmjItem != null) {
            textViewName.setText(hmjItem.getHmjName());
            imageViewFlag.setImageResource(hmjItem.getFlagImage());
        }

        return convertView;
    }

    private Filter hmjFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            List<HmjItem> suggestions = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                suggestions.addAll(hmjListFull);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (HmjItem item : hmjListFull) {
                    if (item.getHmjName().toLowerCase().contains(filterPattern)) {
                        suggestions.add(item);
                    }
                }
            }

            results.values = suggestions;
            results.count = suggestions.size();

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            clear();
            addAll((List)results.values);
            notifyDataSetChanged();
        }

        @Override
        public CharSequence convertResultToString(Object resultValue) {
            return ((HmjItem) resultValue).getHmjName();

        }
    };
}
