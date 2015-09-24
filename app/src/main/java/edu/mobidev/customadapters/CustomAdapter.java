package edu.mobidev.customadapters;

import android.app.Service;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ngoc on 9/24/2015.
 */
public class CustomAdapter extends ArrayAdapter<Superhero>{

    ArrayList<Superhero> superheroes;

    public CustomAdapter(Context context, int resource, ArrayList<Superhero> superheroes) {
        super(context, resource, superheroes);
        this.superheroes = superheroes;
    }

    private class SuperheroHolder{
        TextView tvName;
        TextView tvDescription;
        ImageView ivIcon;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // return super.getView(position, convertView, parent);
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Service.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, parent, false);

            SuperheroHolder sHolder = new SuperheroHolder();
            sHolder.tvName = (TextView) convertView.findViewById(R.id.tv_name);
            sHolder.tvDescription = (TextView) convertView.findViewById(R.id.tv_description);
            sHolder.ivIcon = (ImageView) convertView.findViewById(R.id.iv_icon);
            convertView.setTag(sHolder);
        }

        SuperheroHolder sHolder = (SuperheroHolder) convertView.getTag();
        sHolder.tvName.setText(superheroes.get(position).getName());
        sHolder.tvDescription.setText(superheroes.get(position).getDescription());
        sHolder.ivIcon.setImageResource(superheroes.get(position).getIcon());

        return convertView;
    }
}
