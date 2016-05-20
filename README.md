# Malom J�t�k JavaFX-ben
![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/inditasi_kepernyo.png "A j�t�k Ind�t� k�perny�je")
#### A klasszikus Malom j�t�k JavaFX-ben meg�rva. 

### Funkci�k
*�j felhaszn�l� regisztr�l�sa
*Bejelentkez�s regisztr�lt felhaszn�l�val
*Eredm�nylista megtekint�se, amely a j�t�kosok gy�zelmeit �s veres�geit tartalmazza.
*Malom j�t�k k�t felhaszn�l�val. A felhaszn�l�k egym�s ellen j�tszanak.

### �tmutat� az els� haszn�latn�l

Az alkalmaz�s ind�t�sakor a k�vetkez� k�perny� fogad:

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/inditasi_kepernyo.png  "Az alkalmaz�s ind�t� k�perny�je")

A k�vetkez� opci�k k�z�l v�laszthatunk.
*Bejelentkez�s a j�t�kba.
*�j felhaszn�l� regisztr�l�sa
*Eredm�nylista megtekint�se, amely a j�t�kosok veres�geit �s gy�zelmeit tartalmazza.

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/jatekos_letrehozas_kepernyo.png  "A regisztr�ci�s k�perny�")

Itt lehet �j felhaszn�l�t regisztr�lni. Minden mez� kit�lt�se k�telez�. J�tszani csak regisztr�lt felhaszn�l�k tudnak. 
�j felhaszn�l� l�trehoz�sa ut�n az alkalmaz�s az Ind�t� k�perny�re dob, _�j felhaszn�l� l�trehozva_ �zenettel.

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/ujfelhasznalo_letrehozva.png  "�j felhaszn�l� regisztr�lva")

Az _Eredm�nylista_ gombra kattintva megjelenik egy t�bl�zat azon felhaszn�l�k veres�geivel �s gy�zelmeivel, akik m�r j�tszottak, teh�t van eredm�ny�k.
Az adott list�t lehet rednezni id, n�v, veres�g, gy�zelem szerint n�vekv� �s cs�kken� sorrendben is.

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/eredmenylista_kepernyo.png  "Eredm�nylista")

Regisztr�ci� ut�n a _Bejelentkez�s a j�t�kba_ gombra kattintva a k�vetkez� ablak fogad, ahol be lehet l�pni a felhaszn�l�kkal. 

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/bejelentkezo_kepernyo.png  "Bejelentkez� fel�let")

Miut�n sikeresen bejelentkezt�nk a felhaszn�l�kkal, megjelenik a k�vetkez� ablak. Fontos, hogy a j�t�k ind�t�s�hoz k�t regisztr�lt felhaszn�l�val kell bejelentkezni, en�lk�l nem ind�that� a Malom.

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/sikeres_bejelentkezes.png  "Sikeres bel�p�s mindk�t felhaszn�l�val")

A _J�t�k ind�t�sa_ gombra kattintva elindul a j�t�k. 

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/jatekinditas_utan.png  "J�t�k kezd� k�perny�")

A klasszikus Malom j�t�k t�bl�t l�tjuk, ahol a szab�lyoknak megfelel�en j�tszhat egym�s ellen a k�t felhaszn�l�.
A j�t�kosok a b�bukat a bal eg�rgomb megnyom�s�val tudj�k a megfelel� mez�re h�zni.
A szab�lyok szerint, ha az egyik j�t�kosnak f�gg�legesen vagy v�zszintesen egy sorban h�rom b�but siker�l leraknia, levehet az ellenf�l b�bui k�z�l egyet.
A lev�telhez a bal eg�rgombbal r� kell kattintania a kiv�lasztott b�bura. Ekkor az elt�nik a t�bl�r�l.

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/jatek_kozben.png  "J�t�k k�zben")

J�t�k k�zben meg tudjuk n�zni a j�t�kszab�lyokat is a _Seg�ts�g_ men�pont _J�t�kszab�ly_ men�pontj�t v�lasztva. 
A j�t�kszab�ly megtekint�sekor a megkezdett j�t�kunk a h�tt�rben fut tov�bb. 
A szab�lyzat a k�vetkez�k�ppen n�z ki.

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/jatekszabaly.png  "J�t�kszab�lyok") //TODO

J�t�k k�zben is van lehet�s�g�nk kijelentkez�sre a _F�jl_ men�pont _Kijelentkez�s_ opci�t v�lasztva. Ezesetben a k�vetkez� k�perny� fogad.

![Alt text](https://github.com/bakbalazs/Malom-JavaFx/blob/master/kepek/jatekbol_kijelentkezve.png  "Kijelentkez�s ut�n")

Mindenkinek j� j�t�kot.

### Telep�t�s

##### Els� m�dszer
1. A t�rol� lekl�noz�sa
2. A lekl�nozott t�rol� _Malom-JavaFx_ mapp�j�ban adjuk ki a k�vetkez� parancsot: _mvn package_
3. Miut�n lefutott a parancs, a _Malom-JavaFx_ mapp�ban adjuk ki a _java -jar Malom.jar_ parancsot
4. Az alkalmaz�s indul.

#### M�sodik m�dszer
1. A _Malom.jar_ let�lt�se a t�rol�b�l.
2. Dupla kattint�s a _Malom-jar_ �llom�nyon az alkalmaz�s elind�t�s�t eredm�nyezi.

### Rendszerk�vetelm�nyek
* Java 8 JRE megl�te sz�ks�ges
* Min�l gyorsabb sz�m�t�g�p

### Hardverk�vetelm�nyek
* Eg�r
