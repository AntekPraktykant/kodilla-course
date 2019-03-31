/*
Mamy do czynienia z bardzo małą firmą lotniczą, która oferuje prywatne loty. Do tej pory, wszystko było uzgadniane przez telefon bezpośrednio z klientem, jednak zarząd firmy stwierdził, że jest to bardzo niewydajne rozwiązanie, ponieważ wiele razy muszą powtarzać to samo, a klienci mają problemy z dodzwonieniem się do firmy ze względu na ograniczoną ilość konsultantów.

Uznano, że dobrze byłoby stworzyć system, który posiadałby zapisaną listę wszystkich lotów, np. GDAŃSK -> WROCŁAW.

System mimo samego przetrzymywania lotów powinien zawierać serwis, który pozwoliłby nam operację związane z wyszukiwaniem lotów jak:

Znalezienie wszystkich lotów z podanego miasta
Znalezienie wszystkich lotów do danego miasta
Znalezienie lotów poprzez inne miasto np. lot z Gdańska przez Kraków do Wrocławia
Firma zna się na technologiach i wymaga użycia iteracji za pomocą Stream oraz spodziewa się wykorzystania kontraktu Equals i Hashcode.
 */

package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

    private List<String> flightsTo = new ArrayList<>();
    private List<String> flightsFrom = new ArrayList<>();

    public List<String> getFlightsTo() {
        return flightsTo;
    }

    public List<String> getFlightsFrom() {
        return flightsFrom;
    }
}
