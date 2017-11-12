# NETKaja
## Követelményanalízis
### Funkcionális követelmények

* Regisztrálás / bejelentkezés
* Étel kosárba rakása
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
![Használati-eset diagram-felhasználó](https://github.com/leila199696/beadando/blob/master/funkcio.jpg)
![Használati-eset diagram-admin](https://github.com/leila199696/beadando/blob/master/funkcio_admin.JPG)

| Használati eset neve        | Előfeltétel           | Leírás  |
| ------------- | -------------| -----|
| Regisztráció     | - | - |
| Belépés| regisztráció      | enélkül nem lehet rendelni |
| Kosárba rakás |belépés    | itt választja ki a felhasználó a kívánt ételeket |
| Rendelés | étel kosárba helyezése | amíg nem nyom a felhasználó a rendelés gombra, addig nem mentődnek az adatok |
| Kilépés | belépés | kilépni nem szükséges, de ajánlott |

#### Rendelés menete:
Amennyiben regisztrálva van a felhasználó (ha nincs akkor regisztrál) belép és valamit beletesz a kosarába. Ha már van valami a kosarában, akkor rányom a rendelés gombra, a rendszer elmenti az adatokat és elküldi a rendelést.Rendelést lehet módosítani és törölni is. Rendelés után a felhasználó kiléphet.

## Tervezés
### Architektúra-terv
A belső felépítés modellből, seviceből és repositoryból áll stb. A modell tartalmazza a táblákat és az adattagokat. Minden táblához külön repository, amely az adatbázisrétegért felel. A service-k megvalósítják az összes backendes funkciót.
#### Oldaltérkép:
![Architektúra rajz](https://github.com/leila199696/beadando/blob/master/arch.JPG)

#### Végpontok:
### Felhasználóifelület-modell
#### Oldalvázlatok:
### Osztálymodell
#### Adatmodell:
#### Adatbázisterv:
#### Állapotdiagram:
### Dinamikus működés

## Implementáció
## Tesztelés
## Felhasználói dokumentáció
