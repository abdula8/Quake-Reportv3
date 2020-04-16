package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.quake_report.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // check if the current view is reused else inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item,
                    parent, false);
        }
        //get the object located at position
        Earthquake currentEarthquake = getItem(position);

        TextView magnitude = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitude.setText(currentEarthquake.getMagnitude());

        TextView location = (TextView) listItemView.findViewById(R.id.location_offset);
        location.setText(currentEarthquake.getLocationOffset());

        TextView country = (TextView) listItemView.findViewById(R.id.primary_location);
        country.setText(currentEarthquake.getPrimaryLocation());

        // Create a new Date object from the time in milliseconds of the earthquake
//        String getDate = currentEarthquake.getDate();
//        Date dateObject = new Date(getDate);
        // Find the TextView with view ID date
        TextView date = (TextView) listItemView.findViewById(R.id.date);
        // Format the date string (i.e. "Mar 3, 1984")
//        String formattedDate = formatDate(dateObject);
        // Display the date of the current earthquake in that TextView
        date.setText(currentEarthquake.getDate());

        // Find the TextView with view ID time
        TextView time = (TextView) listItemView.findViewById(R.id.time);
        // Format the time string (i.e. "4:30PM")
//        String formattedTime = formatTime(dateObject);
        // Display the time of the current earthquake in that TextView
        time.setText(currentEarthquake.getDate());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM DD, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}
