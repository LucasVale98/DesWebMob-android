/**
 * Uriel Henrique Marques Farias Mishima RA: 81717300
 */
package br.usjt.ciclodevidagpsemapas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/*Lucas Do Vale Conceição
RA:817116816
 */

public class LocalizacoesArrayAdapter extends ArrayAdapter<Localizacao> {

    public LocalizacoesArrayAdapter(Context context, List<Localizacao> localizacoes) {
        super(context, -1, localizacoes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Localizacao localizacao = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        if(convertView == null){
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }
        TextView latitude = convertView.findViewById(R.id.latitudeTextView);
        TextView longitude = convertView.findViewById(R.id.longitudeTextView);

        latitude.setText("Latitude: " + localizacao.getLatitude());
        longitude.setText("Longitude: " + localizacao.getLongitude());
        return convertView;
    }
}
