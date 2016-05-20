# Malom Játék JavaFX-ben
![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/inditasi_kepernyo.png "A játék Indító képernyõje")
#### A klasszikus Malom játék JavaFX-ben megírva. 

### Funkciók
*Új felhasználó regisztrálása
*Bejelentkezés regisztrált felhasználóval
*Eredménylista megtekintése, amely a játékosok gyõzelmeit és vereségeit tartalmazza.
*Malom játék két felhasználóval. A felhasználók egymás ellen játszanak.

### Útmutató az elsõ használatnál

Az alkalmazás indításakor a következõ képernyõ fogad:

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/inditasi_kepernyo.png  "Az alkalmazás indító képernyõje")

A következõ opciók közül választhatunk.
*Bejelentkezés a játékba.
*Új felhasználó regisztrálása
*Eredménylista megtekintése, amely a játékosok vereségeit és gyõzelmeit tartalmazza.

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/jatekos_letrehozas_kepernyo.png  "A regisztrációs képernyõ")

Itt lehet új felhasználót regisztrálni. Minden mezõ kitöltése kötelezõ. Játszani csak regisztrált felhasználók tudnak. 
Új felhasználó létrehozása után az alkalmazás az Indító képernyõre dob, _Új felhasználó létrehozva_ üzenettel.

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/ujfelhasznalo_letrehozva.png  "Új felhasználó regisztrálva")

Az _Eredménylista_ gombra kattintva megjelenik egy táblázat azon felhasználók vereségeivel és gyõzelmeivel, akik már játszottak, tehát van eredményük.
Az adott listát lehet rednezni id, név, vereség, gyõzelem szerint növekvõ és csökkenõ sorrendben is.

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/eredmenylista_kepernyo.png  "Eredménylista")

Regisztráció után a _Bejelentkezés a játékba_ gombra kattintva a következõ ablak fogad, ahol be lehet lépni a felhasználókkal. 

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/bejelentkezo_kepernyo.png  "Bejelentkezõ felület")

Miután sikeresen bejelentkeztünk a felhasználókkal, megjelenik a következõ ablak. Fontos, hogy a játék indításához két regisztrált felhasználóval kell bejelentkezni, enélkül nem indítható a Malom.

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/sikeres_bejelentkezes.png  "Sikeres belépés mindkét felhasználóval")

A _Játék indítása_ gombra kattintva elindul a játék. 

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/jatekinditas_utan.png  "Játék kezdõ képernyõ")

A klasszikus Malom játék táblát látjuk, ahol a szabályoknak megfelelõen játszhat egymás ellen a két felhasználó.
A játékosok a bábukat a bal egérgomb megnyomásával tudják a megfelelõ mezõre húzni.
A szabályok szerint, ha az egyik játékosnak függõlegesen vagy vízszintesen egy sorban három bábut sikerül leraknia, levehet az ellenfél bábui közül egyet.
A levételhez a bal egérgombbal rá kell kattintania a kiválasztott bábura. Ekkor az eltûnik a tábláról.

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/jatek_kozben.png  "Játék közben")

Játék közben meg tudjuk nézni a játékszabályokat is a _Segítség_ menüpont _Játékszabály_ menüpontját választva. 
A játékszabály megtekintésekor a megkezdett játékunk a háttérben fut tovább. 
A szabályzat a következõképpen néz ki.

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/jatekszabaly.png  "Játékszabályok") //TODO

Játék közben is van lehetõségünk kijelentkezésre a _Fájl_ menüpont _Kijelentkezés_ opciót választva. Ezesetben a következõ képernyõ fogad.

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/jatekbol_kijelentkezve.png  "Kijelentkezés után")

Mindenkinek jó játékot.

### Telepítés

##### Elsõ módszer
1. A tároló leklónozása
2. A leklónozott tároló _Malom-JavaFx_ mappájában adjuk ki a következõ parancsot: _mvn package_
3. Miután lefutott a parancs, a _Malom-JavaFx_ mappában adjuk ki a _java -jar Malom.jar_ parancsot
4. Az alkalmazás indul.

#### Második módszer
1. A _Malom.jar_ letöltése a tárolóból.
2. Dupla kattintás a _Malom-jar_ állományon az alkalmazás elindítását eredményezi.

### Rendszerkövetelmények
* Java 8 JRE megléte szükséges
* Minél gyorsabb számítógép

### Hardverkövetelmények
* Egér
