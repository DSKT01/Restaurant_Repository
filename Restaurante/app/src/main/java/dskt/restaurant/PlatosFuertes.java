package dskt.restaurant;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

import java.util.ArrayList;

public class PlatosFuertes extends Activity {
    private ListView lvItems;
    private Adaptador adaptador;
    ArrayList<Entidad> lista = new ArrayList<>();
    Entidad item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_platos_fuertes);

        lvItems = (ListView)findViewById(R.id.lv_itemsPlatosFuertes);

        item = new Entidad("Sopa y Seco..........$7.000", "Rica sopa con mas tomate.");
        lista.add(item);
        item = new Entidad("Cañon de Cerdo.......$10.000", "Acompañado de papas.");
        lista.add(item);
        item = new Entidad("Especialidad.........$15.000", "???????");
        lista.add(item);

        adaptador = new Adaptador(lista, this);
        lvItems.setAdapter(adaptador);
    }

}
