package busqueda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author milver
 */
public class Mapa {
   
   private String [] punata={"tiraque","arani","jordan"};
   private String [] mizque={"arani","campero"};
   private String [] arani={"mizque","carrasco","tiraque","punata"};
   private String [] arque={"bolivar","capinota","tapacari"};
   private String [] ayopaya={"tapacari"};
   private String [] bolivar={"arque"};
   private String [] carrasco={"arani","campero"};
   private String [] capinota={"arque","quillacollo"};
   private String [] campero={"carrasco","mizque"};
   private String [] chapare={"cercado"};
   private String [] EArce={"cercado"};
   private String [] jordan={"punata","cercado"};
   private String [] quillacollo={"cercado","capinota","tapacari"};
   private String [] tapacari={"quillacollo","ayopaya","arque"};
   private String [] tiraque={"arani","punata"};
   private String [] cercado={"quillacollo","EArce","jordan","chapare"};
   
   private ArrayList<String> caminoRecorrido;
   private Map<String,Integer>rutas;
   private Map<String,String[]>vecinos;
   private Nodo raiz;
   private String anterior;
   private String meta;
   public Mapa(String provOrg,String provDest){
      caminoRecorrido=new ArrayList<String>();
      rutas=new HashMap<String,Integer>();
      vecinos=new HashMap<String,String[]>();
      provinciasAndVecinos();
      distanciaRutas();
      raiz=new Nodo(provOrg);
      meta=provDest;
      anterior="";
   }
   public ArrayList<String> getCaminoRecorrido(){
      return caminoRecorrido;
   }
   public void busquedaAscensoColina(){
      int cont=0;
      while(!(raiz.getElemento().equals(meta))){
         caminoRecorrido.add(raiz.getElemento());
         generarHijos(raiz,anterior);
         cont++;
      }
      caminoRecorrido.add(meta);
   }
   public void generarHijos(Nodo nr,String ant){
      String vec[]=vecinos.get(nr.getElemento());
      for (int k = 0; k < vec.length; k++) {
         if (vec[k].equals(ant)) {
            
         }
         else{
            raiz.addHijo(new Nodo(vec[k]));
         }
      }
      anterior=raiz.getElemento();
      raiz=getMejorHijo(raiz.getHijos());
   }
   public Nodo getMejorHijo(List<Nodo> hijos){
      Nodo mejor=hijos.get(0);
      for (int i = 1; i <hijos.size(); i++) {
         if (rutas.get(mejor.getElemento()+"-"+meta)>(rutas.get(hijos.get(i).getElemento()+"-"+meta))) {
            mejor=hijos.get(i);
         }
         else{
         }
      }
      return mejor;
   }
   public void provinciasAndVecinos(){
      vecinos.put("punata",punata);
      vecinos.put("mizque",mizque);
      vecinos.put("arani",arani);
      vecinos.put("arque",arque);
      vecinos.put("ayopaya",ayopaya);
      vecinos.put("bolivar",bolivar);
      vecinos.put("carrasco",carrasco);
      vecinos.put("capinota",capinota);
      vecinos.put("campero",campero);
      vecinos.put("chapare",chapare);
      vecinos.put("EArce",EArce);
      vecinos.put("jordan",jordan);
      vecinos.put("quillacollo",quillacollo);
      vecinos.put("tapacari",tapacari);
      vecinos.put("tiraque",tiraque);
      vecinos.put("cercado",cercado);
   }
   public void distanciaRutas(){
      //cercado
      rutas.put("cercado-punata", 58);
      rutas.put("cercado-mizque", 150);
      rutas.put("cercado-arani", 65);
      rutas.put("cercado-arque", 105);
      rutas.put("cercado-ayopaya", 220);
      rutas.put("cercado-bolivar", 159);
      rutas.put("cercado-carrasco", 142);
      rutas.put("cercado-capinota", 66);
      rutas.put("cercado-campero", 217);
      rutas.put("cercado-chapare", 13);
      rutas.put("cercado-EArce", 33);
      rutas.put("cercado-jordan", 37);
      rutas.put("cercado-quillacollo", 13);
      rutas.put("cercado-tapacari", 67);
      rutas.put("cercado-tiraque", 65);
      rutas.put("cercado-carcado", 0);
      //tiraque
      rutas.put("tiraque-punata", 7);
      rutas.put("tiraque-mizque", 99);
      rutas.put("tiraque-arani", 14);
      rutas.put("tiraque-arque", 170);
      rutas.put("tiraque-ayopaya", 285);
      rutas.put("tiraque-bolivar", 224);
      rutas.put("tiraque-carrasco", 91);
      rutas.put("tiraque-capinota", 131);
      rutas.put("tiraque-campero", 164);
      rutas.put("tiraque-chapare", 78);
      rutas.put("tiraque-EArce", 98);
      rutas.put("tiraque-jordan", 28);
      rutas.put("tiraque-quillacollo", 78);
      rutas.put("tiraque-tapacari", 132);
      rutas.put("tiraque-tiraque", 0);
      rutas.put("tiraque-cercado", 65);
      //tapacari
      rutas.put("tapacari-punata", 125);
      rutas.put("tapacari-mizque", 217);
      rutas.put("tapacari-arani", 132);
      rutas.put("tapacari-arque", 38);
      rutas.put("tapacari-ayopaya", 153);
      rutas.put("tapacari-bolivar", 92);
      rutas.put("tapacari-carrasco", 209);
      rutas.put("tapacari-capinota", 78);
      rutas.put("tapacari-campero", 284);
      rutas.put("tapacari-chapare", 80);
      rutas.put("tapacari-EArce", 100);
      rutas.put("tapacari-jordan", 104);
      rutas.put("tapacari-quillacollo", 54);
      rutas.put("tapacari-tapacari", 0);
      rutas.put("tapacari-tiraque", 132);
      rutas.put("tapacari-cercado", 67);
      //quillacollo
      rutas.put("quillacollo-punata", 71);
      rutas.put("quillacollo-mizque", 163);
      rutas.put("quillacollo-arani", 78);
      rutas.put("quillacollo-arque", 92);
      rutas.put("quillacollo-ayopaya", 207);
      rutas.put("quillacollo-bolivar", 146);
      rutas.put("quillacollo-carrasco", 155);
      rutas.put("quillacollo-capinota", 53);
      rutas.put("quillacollo-campero", 230);
      rutas.put("quillacollo-chapare", 26);
      rutas.put("quillacollo-EArce", 46);
      rutas.put("quillacollo-jordan", 50);
      rutas.put("quillacollo-quillacollo", 0);
      rutas.put("quillacollo-tapacari", 54);
      rutas.put("quillacollo-tiraque", 78);
      rutas.put("quillacollo-cercado", 13);
      //jordan
      rutas.put("jordan-punata", 21);
      rutas.put("jordan-mizque", 103);
      rutas.put("jordan-arani", 28);
      rutas.put("jordan-arque", 142);
      rutas.put("jordan-ayopaya", 257);
      rutas.put("jordan-bolivar", 196);
      rutas.put("jordan-carrasco", 105);
      rutas.put("jordan-capinota", 103);
      rutas.put("jordan-campero", 180);
      rutas.put("jordan-chapare", 50);
      rutas.put("jordan-EArce", 70);
      rutas.put("jordan-jordan", 0);
      rutas.put("jordan-quillacollo", 50);
      rutas.put("jordan-tapacari", 104);
      rutas.put("jordan-tiraque", 28);
      rutas.put("jordan-cercado", 37);
      //EArce
      rutas.put("EArce-punata", 91);//
      rutas.put("EArce-mizque", 183);//
      rutas.put("EArce-arani", 98);//
      rutas.put("EArce-arque", 138);//
      rutas.put("EArce-ayopaya", 253);//
      rutas.put("EArce-bolivar", 192);//
      rutas.put("EArce-carrasco", 175);//
      rutas.put("EArce-capinota", 99);//
      rutas.put("EArce-campero", 250);//
      rutas.put("EArce-chapare", 46);//
      rutas.put("EArce-EArce", 0);//
      rutas.put("EArce-jordan", 70);//
      rutas.put("EArce-quillacollo", 46);//
      rutas.put("EArce-tapacari", 100);//
      rutas.put("EArce-tiraque", 98);//
      rutas.put("EArce-cercado", 33);//
      //jordan
      rutas.put("chapare-punata", 71);//
      rutas.put("chapare-mizque", 163);//
      rutas.put("chapare-arani", 78);//
      rutas.put("chapare-arque", 118);//
      rutas.put("chapare-ayopaya", 233);//
      rutas.put("chapare-bolivar", 172);//
      rutas.put("chapare-carrasco", 155);//
      rutas.put("chapare-capinota", 79);//
      rutas.put("chapare-campero", 230);//
      rutas.put("chapare-chapare", 0);//
      rutas.put("chapare-EArce", 46);//
      rutas.put("chapare-jordan", 50);
      rutas.put("chapare-quillacollo", 26);
      rutas.put("chapare-tapacari", 80);
      rutas.put("chapare-tiraque", 78);
      rutas.put("chapare-cercado", 13);
      //campero
      rutas.put("campero-punata", 159);
      rutas.put("campero-mizque", 67);
      rutas.put("campero-arani", 152);
      rutas.put("campero-arque", 322);
      rutas.put("campero-ayopaya", 437);
      rutas.put("campero-bolivar", 376);
      rutas.put("campero-carrasco", 75);
      rutas.put("campero-capinota", 283);
      rutas.put("campero-campero", 0);
      rutas.put("campero-chapare", 230);
      rutas.put("campero-EArce", 250);
      rutas.put("campero-jordan", 180);
      rutas.put("campero-quillacollo", 230);
      rutas.put("campero-tapacari", 284);
      rutas.put("campero-tiraque", 164);
      rutas.put("campero-cercado", 217);
      //capinota
      rutas.put("capinota-punata", 124);
      rutas.put("capinota-mizque", 216);
      rutas.put("capinota-arani", 131);
      rutas.put("capinota-arque", 208);
      rutas.put("capinota-ayopaya", 231);
      rutas.put("capinota-bolivar", 94);
      rutas.put("capinota-carrasco", 208);
      rutas.put("capinota-capinota", 0);
      rutas.put("capinota-campero", 283);
      rutas.put("capinota-chapare", 79);
      rutas.put("capinota-EArce", 99);
      rutas.put("capinota-jordan", 103);
      rutas.put("capinota-quillacollo", 53);
      rutas.put("capinota-tapacari", 78);
      rutas.put("capinota-tiraque", 131);
      rutas.put("capinota-cercado", 66);
      //carrasco
      rutas.put("carrasco-punata", 84);
      rutas.put("carrasco-mizque", 142);
      rutas.put("carrasco-arani", 77);
      rutas.put("carrasco-arque", 142);
      rutas.put("carrasco-ayopaya", 362);
      rutas.put("carrasco-bolivar", 301);
      rutas.put("carrasco-carrasco", 0);
      rutas.put("carrasco-capinota", 208);
      rutas.put("carrasco-campero", 75);
      rutas.put("carrasco-chapare", 155);
      rutas.put("carrasco-EArce", 175);
      rutas.put("carrasco-jordan", 105);
      rutas.put("carrasco-quillacollo", 155);
      rutas.put("carrasco-tapacari", 209);
      rutas.put("carrasco-tiraque", 91);
      rutas.put("carrasco-cercado", 142);
      //bolivar
      rutas.put("bolivar-punata", 217);
      rutas.put("bolivar-mizque", 309);
      rutas.put("bolivar-arani", 224);
      rutas.put("bolivar-arque", 54);
      rutas.put("bolivar-ayopaya", 245);
      rutas.put("bolivar-bolivar", 0);
      rutas.put("bolivar-carrasco", 301);
      rutas.put("bolivar-capinota", 94);
      rutas.put("bolivar-campero", 376);
      rutas.put("bolivar-chapare", 172);
      rutas.put("bolivar-EArce", 192);
      rutas.put("bolivar-jordan", 196);
      rutas.put("bolivar-quillacollo", 142);
      rutas.put("bolivar-tapacari", 92);
      rutas.put("bolivar-tiraque", 224);
      rutas.put("bolivar-cercado", 159);
      //ayopaya
      rutas.put("ayopaya-punata", 278);
      rutas.put("ayopaya-mizque", 370);
      rutas.put("ayopaya-arani", 285);
      rutas.put("ayopaya-arque", 191);
      rutas.put("ayopaya-ayopaya",0);
      rutas.put("ayopaya-bolivar", 248);
      rutas.put("ayopaya-carrasco", 362);
      rutas.put("ayopaya-capinota", 231);
      rutas.put("ayopaya-campero", 437);
      rutas.put("ayopaya-chapare",233);
      rutas.put("ayopaya-EArce", 253);
      rutas.put("ayopaya-jordan", 257);
      rutas.put("ayopaya-quillacollo", 207);
      rutas.put("ayopaya-tapacari", 153);
      rutas.put("ayopaya-tiraque", 285);
      rutas.put("ayopaya-cercado", 220);
      //arque
      rutas.put("arque-punata", 163);
      rutas.put("arque-mizque", 255);
      rutas.put("arque-arani", 170);
      rutas.put("arque-arque", 0);
      rutas.put("arque-ayopaya", 191);
      rutas.put("arque-bolivar", 54);
      rutas.put("arque-carrasco", 152);
      rutas.put("arque-capinota", 208);
      rutas.put("arque-campero", 322);
      rutas.put("arque-chapare", 118);
      rutas.put("arque-EArce", 138);
      rutas.put("arque-jordan", 142);
      rutas.put("arque-quillacollo", 92);
      rutas.put("arque-tapacari", 38);
      rutas.put("arque-tiraque", 170);
      rutas.put("arque-cercado", 105);
      //arani
      rutas.put("arani-punata", 7);
      rutas.put("arani-mizque", 85);
      rutas.put("arani-arani", 0);
      rutas.put("arani-arque", 170);
      rutas.put("arani-ayopaya", 285);
      rutas.put("arani-bolivar", 224);
      rutas.put("arani-carrasco", 77);
      rutas.put("arani-capinota", 131);
      rutas.put("arani-campero", 152);
      rutas.put("arani-chapare", 78);
      rutas.put("arani-EArce", 98);
      rutas.put("arani-jordan", 28);
      rutas.put("arani-quillacollo", 78);
      rutas.put("arani-tapacari", 132);
      rutas.put("arani-tiraque", 14);
      rutas.put("arani-cercado", 65);
      //mizque
      rutas.put("mizque-punata", 92);
      rutas.put("mizque-mizque", 0);
      rutas.put("mizque-arani", 85);
      rutas.put("mizque-arque", 255);
      rutas.put("mizque-ayopaya", 370);
      rutas.put("mizque-bolivar", 309);
      rutas.put("mizque-carrasco", 142);
      rutas.put("mizque-capinota", 216);
      rutas.put("mizque-campero", 67);
      rutas.put("mizque-chapare", 163);
      rutas.put("mizque-EArce", 183);
      rutas.put("mizque-jordan", 103);
      rutas.put("mizque-quillacollo", 163);
      rutas.put("mizque-tapacari", 217);
      rutas.put("mizque-tiraque", 99);
      rutas.put("mizque-cercado", 150);
      //punata
      rutas.put("punata-punata", 0);
      rutas.put("punata-mizque", 92);
      rutas.put("punata-arani", 7);
      rutas.put("punata-arque", 167);
      rutas.put("punata-ayopaya", 278);
      rutas.put("punata-bolivar", 217);
      rutas.put("punata-carrasco", 84);
      rutas.put("punata-capinota", 124);
      rutas.put("punata-campero", 159);
      rutas.put("punata-chapare",71);
      rutas.put("punata-EArce", 91);
      rutas.put("punata-jordan", 21);
      rutas.put("punata-quillacollo", 71);
      rutas.put("punata-tapacari", 125);
      rutas.put("punata-tiraque", 7);
      rutas.put("punata-cercado", 58);
      
   }
   
}













