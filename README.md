# NETKaja
### Funkcionális követelmények

* Regisztrálás / bejelentkezés
* Étel kosárba rakása (?)
* Étel megrendelés
* Aktuális ajánlatok lekérdezése
* Gombás ételek külön feltüntetése
* Akciós ajánlatok
* Kategorizálás (leves,főétel,szárnyasok..)

### Nem funkcionális követelmények

A fejlesztéshez használt szoftverek:
* Operációs rendszer: Windows 10

Java fejlesztőeszköz: 
* NetBeans, Intellij

A futtatáshoz szükséges operációs rendszer:
* Tetszőleges operációs rendszer, melyhez létezik JRE 6 implementáció

A futtatáshoz szükséges hardver:
* Operációs rendszerek szerint megadva

Egyéb követelmények:
* Intuitív felhasználói felület, könnyű kezelhetőség

#### Használati-eset diagram:
![Használati-eset diagram](https://scontent.fbud5-1.fna.fbcdn.net/v/t34.0-12/22472830_1590360404361834_551359648_n.jpg?oh=3dec9fcae14ed3962e0d98bd77ab1108&oe=59E2E3F2)

| Használati eset neve        | Előfeltétel           | Leírás  |
| ------------- | -------------| -----|
| Regisztráció     | - | - |
| Belépés| regisztráció      | enélkül nem lehet rendelni |
| Kosárba rakás |belépés    | itt választja ki a felhasználó a kívánt ételeket |
| Rendelés | étel kosárba helyezése | amíg nem nyom a felhasználó a rendelés gombra, addig nem mentődnek az adatok |
| Kilépés | belépés | kilépni nem szükséges, de ajánlott |
####Rendelés menete:

