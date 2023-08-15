package sg.edu.rp.c346.id22021538.demoweather;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WeatherAdapter extends ArrayAdapter<Weather> {
    private Context context;
    private int resource;
    private ArrayList<Weather> weatherList;

    public WeatherAdapter(Context context, int resource, ArrayList<Weather> weatherList) {
        super(context, resource, weatherList);
        this.context = context;
        this.resource = resource;
        this.weatherList = weatherList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(resource, parent, false);

        TextView tvArea = rowView.findViewById(R.id.tvArea);
        TextView tvForecast = rowView.findViewById(R.id.tvForecast);

        Weather weather = weatherList.get(position);

        tvArea.setText(weather.getArea());
        tvForecast.setText(weather.getForecast());

        return rowView;
    }
}