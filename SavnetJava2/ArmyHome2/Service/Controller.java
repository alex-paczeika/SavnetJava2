package Service;

import DataAccesPackage.FakeDAO;
import Model.Soldati;

import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {

       FakeDAO fakeDAO = new FakeDAO();

fakeDAO.BazadeDate();
      fakeDAO.AfisaresiSortare();
      fakeDAO.ArmyBattle();

    }



}
