package com.example.lab8_cli.StatsBundle;

import java.util.ListResourceBundle;

public class StatsBundle_de_DE extends ListResourceBundle {

    private final Object[][] resources = {
            {"UsernameLabel","Nutzername"},
            {"PasswordLabel", "Passwort"},
            {"RefreshButton","Aktualisierung"},
            {"InfoButton", "Information"},
            {"AddButton","Hinzufügen"},
            {"UpdateButton","Aktualisieren"},
            {"RemoveButton","Entfernen"},
            {"ClearButton","Klar"},
            {"ExecuteScriptButton", "Skript"},
            {"AddIfMaxButton","Fügen Sie hinzu, wenn max"},
            {"RemoveGreaterButton","Größer entfernen"},
            {"CountLessThanFuelTypeButton", "Zählen Sie weniger als Kraftstofftyp"},
            {"FilterLessThanFuelConsumptionButton","Filtern Sie weniger als den Kraftstoffverbrauch"},
            {"GroupCountingByCapacityButton","Gruppenzählung nach Kapazität"},
            {"RefreshButtonTooltip","Leinwand und Tabelle aktualisieren"},
            {"InfoButtonTooltip","Informationen über die Sammlung anzeigen"},
            {"AddButtonTooltip","Fügen Sie der Sammlung ein neues Element hinzu"},
            {"UpdateButtonTooltip","Aktualisieren Sie ein Element in der Sammlung"},
            {"RemoveButtonTooltip","Entfernen Sie ein Element aus der Sammlung"},
            {"ClearButtonTooltip","Löschen Sie die Sammlung"},
            {"ExecuteButtonTooltip","Skript aus einer Datei ausführen"},
            {"AddIfMaxButtonTooltip","Fügen Sie ein neues Element hinzu, wenn sein Wert größer ist als die größten"},
            {"RemoveGreaterButtonTooltip","Entfernen Sie alle Elemente, die höher als ausgewählt sind"},
            {"IdColumn","ID"},
            {"OwnerColumn","Eigentümer"},
            {"CreationDateColumn","Creation Date"},
            {"NameColumn","Name"},
            {"CoordinatesXColumn","X"},
            {"CoordinatesYColumn","Y"},
            {"EnginePowerColumn","Motorleistung"},
            {"CapacityColumn","Kapazität"},
            {"FuelConsumptionColumn","Kraftstoffverbrauch"},
            {"FuelTypeColumn","Treibstoffart"},
            {"TableTab","Tisch"},
            {"CanvasTab","Leinwand"},
            {"EnterButton","Eintreten"},
            {"NameEmptyException","Der Name darf nicht leer sein!"},
            {"CoordinatesXFormatException","X muss eine Zahl sein!"},
            {"CoordinatesYFormatException","Y muss eine Zahl sein!"},
            {"UpdateButtonSelectionException","Wählen Sie das zu aktualisierende Fahrzeug aus!"},
            {"RemoveButtonSelectionException","Wählen Sie das zu entfernende Fahrzeug aus!"},
            {"RemoveGreaterButtonSelectionException","Wählen Sie das Fahrzeug aus, um mehr zu entfernen!"},
            {"EnterName","Geben Sie einen Namen ein:"},
            {"NameNotIdentifiedException","Name wird nicht erkannt!"},
            {"UnexpectedException","Unerwarteter Fehler!"},
            {"EnterX","X-Koordinate eingeben:"},
            {"XNotIdentifiedException","X-Koordinate wird nicht erkannt!"},
            {"XMustBeNumberException","Die X-Koordinate muss eine Zahl sein!"},
            {"EnterY","Geben Sie die Y-Koordinate ein :"},
            {"YNotIdentifiedException","Y Nicht erkannt!"},
            {"YMustBeNumberException","Die Y-Koordinate muss durch eine Zahl dargestellt werden!"},
            {"YMustBeLessException","Y darf {0} nicht überschreiten!"},
            {"ScriptRecursionException","Skripte können nicht rekursiv aufgerufen werden!"},
            {"IncorrectInputInScriptException","Die Skriptausführung wird unterbrochen!"},
            {"CommandNotFoundException","Befehl '' {0} '' nicht gefunden. Geben Sie '' Hilfe '' als Referenz ein."},
            {"Using","Use:'' {0}''"},
            {"ChangeNameQuestion","Möchten Sie den Namen des Fahrzeugs ändern?"},
            {"ChangeCoordinatesQuestion","Möchten Sie die Koordinaten des Fahrzeugs ändern?"},
            {"ClientException","Client kann nicht gestartet werden!"},
            {"EndWorkOfClient","Client wurde gestoppt."},
            {"EndWorkOfClientException","Beim Versuch, die Verbindung zum Server zu beenden, ist ein Fehler aufgetreten!"},
            {"EndRunningWorkOfClientException","Verbindung kann nicht beendet werden noch nicht aufgebaut!"},
            {"DataSendingException","Beim Senden der Daten zum Server ist ein Fehler aufgetreten!"},
            {"DataReadingException","Beim Lesen der empfangenen Daten ist ein Fehler aufgetreten!"},
            {"EndConnectionToServerException","Verbindung zum Server unterbrochen!"},
            {"ConnectionToServerComplete","Verbindung mit Server hergestellt!"},
            {"TryCommandLater","Versuchen Sie später, den Befehl zu wiederholen."},
            {"TryAuthLater","Versuchen Sie später, die Authentifizierung zu wiederholen."},
            {"ConnectionToServer","Mit Server verbinden..."},
            {"ServerAddressException","Serveradresse ist nicht korrekt eingetragen!"},
            {"ConnectionToServerException","Beim Verbinden mit dem Server ist ein Fehler aufgetreten!"},
            {"CountLessThanFuelTypeButtonTooltip", "Count the number of vehicle has fuel type less than the given one"},
            {"FilterLessThanFuelConsumptionButtonTooltip", "Filter the vehicle that less than the given fuel type"},
            {"GroupCountingByCapacityButtonTooltip", "Group count by capacity"},
            {"RefreshButtonTooltip", "refresh"},
            {"RegisterCheckbox", "Regiter box"},
            {"SignInButton", "Sign in "},
            {"Summit", "Summit"},
            {"Connected", "Connected"},
            {"NotConnected", "NotConnected"}
    };

    @Override
    protected Object[][] getContents() {
        return resources;
    }
}