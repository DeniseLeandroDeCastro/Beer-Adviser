package br.com.trilhamobile.beeradviser.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

import br.com.trilhamobile.beeradviser.R;

public class FindBeerActivity extends Activity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    //Chamado quando o botão é clicado
    public void onClickFindBeer(View view) {
        //Obtém ume referência para TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        //Obtém uma referência para o Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Obtém o item selecionado no Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        //Obtém recomendações da classe BeerExpert
        List<String> brandsList= expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand: brandsList) {
            brandsFormatted.append(brand).append('\n');
        }
        //Exibe as cervejas
        brands.setText(brandsFormatted);
    }
}