package fastFoodShop.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import fastFoodShop.accounts.Accounts;
import fastFoodShop.dto.Coke;
import fastFoodShop.dto.ExtraToppings;
import fastFoodShop.dto.FingerChips;
import fastFoodShop.dto.Order;
import fastFoodShop.dto.Pizza;
import fastFoodShopBill.dao.FastFoodShopBillDao;
import fastFoodShopDB.dao.CokeDBDao;
import fastFoodShopDB.dao.OrdersDBDao;

public class FastFoodShopUserController {
	
	

	public static void main(String[] args) throws IOException {

		
		Scanner scanner = new Scanner(System.in);

		

		CokeDBDao cockDao = new CokeDBDao();
		OrdersDBDao pizzaShopDataBaseOrdersDao = new OrdersDBDao();
		Accounts accounts = new Accounts();
		FastFoodShopBillDao pizzaShopConsoleDao = new FastFoodShopBillDao();

		boolean closeApplication = false;
		while (!closeApplication) {
			List<Object> orderList = new ArrayList<Object>();
			System.out.println(
					"=========================================\n         WEL-COME TO PIZZA HOUSE\n  \n=========================================        \n \n Placing your order . . . ....");

			boolean wantPizzaOrBurger = true;
			while (wantPizzaOrBurger) {

				System.out.println("  * Please select your Item's \n \n   1.PIZZA \n   2.BURGER \n   3.FINGER CHIPS");
				boolean isCockAvailable = cockDao.isCockAvailable();
				if (isCockAvailable) {
					System.out.println("   4.COCK");
				}
				System.out.println("5.CLOSE APPLICATION");

				switch (scanner.nextInt()) {
				case 1: {//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

					Pizza pizza = new Pizza();
					System.out.println("  * Please Choose Pizza Type\n \n"
							+ "   1.PIZZA MARGHERITA\n   2.CHOCOLATE PIZZA\n" + "   3.FOUR CHEESE PIZZA ");

					switch (scanner.nextInt()) {
					case 1: {// pizza MARGHERITA
						System.out
								.println("  * Please Choose PIZZA MARGHERITA's Size\n \n" + "   1.Large\n   2.Small\n");

						switch (scanner.nextInt()) {
						case 1: {// large pizza

							System.out.println("  * Please Choose Pizza's QTY");

							pizza.setQty(scanner.nextInt());

							pizza.setName("PIZZA MARGHERITA");
							pizza.setUnit("Large");
							pizza.setPrice(200);

							break;
						}
						case 2: {// small pizza

							System.out.println("  * Please Choose Pizza's QTY");

							pizza.setQty(scanner.nextInt());

							pizza.setName("PIZZA MARGHERITA");
							pizza.setUnit("small");
							pizza.setPrice(100);

							break;
						}
						}

						break;
					}
					case 2: {// chocolate pizza
						System.out
								.println("  * Please Choose CHOCOLATE PIZZA's Size\n \n" + "   1.Large\n   2.Small\n");

						switch (scanner.nextInt()) {
						case 1: {// large pizza

							System.out.println("  * Please Choose Pizza's QTY");

							pizza.setQty(scanner.nextInt());

							pizza.setName("CHOCOLATE PIZZA ");
							pizza.setUnit("Large");
							pizza.setPrice(230);

							break;
						}
						case 2: {// small pizza

							System.out.println("  * Please Choose Pizza's QTY");

							pizza.setQty(scanner.nextInt());

							pizza.setName("CHOCOLATE PIZZA ");
							pizza.setUnit("small");
							pizza.setPrice(115);

							break;
						}
						}

						break;
					}
					case 3: {// FOUR CHEESE PIZZA

						System.out.println(
								"  * Please Choose FOUR CHEESE PIZZA's Size\n \n" + "   1.Large\n   2.Small\n");

						switch (scanner.nextInt()) {
						case 1: {// large pizza

							System.out.println("  * Please Choose Pizza's QTY");

							pizza.setQty(scanner.nextInt());

							pizza.setName("FOURCHEESE PIZZA");
							pizza.setUnit("Large");
							pizza.setPrice(240);

							break;
						}
						case 2: {// small pizza

							System.out.println("  * Please Choose Pizza's QTY");

							pizza.setQty(scanner.nextInt());

							pizza.setName("FOURCHEESE PIZZA");
							pizza.setUnit("small");
							pizza.setPrice(120);

							break;
						}
						}

						break;
					}
					}

					orderList.add(pizza);
					while (true) {
						System.out.println("  * Want to add Extra toppings \n   1.Yes \n   2.No \n");
						int wnatExtraTopping = scanner.nextInt();
						if (wnatExtraTopping == 1) {

							ExtraToppings extraToppings = new ExtraToppings();

							System.out.println(
									"  * Please Choose Pizza Type Extra toppings \n \n   1.PEPPERONI \n   2.MUSHROOM \n"
											+ "   3.EXTRA CHEESE \n   4.ONION \n   5.GREEN PEPPER ");

							int choice = scanner.nextInt();
							if (choice == 1) {

								extraToppings.setName("PEPPERONI       ");
								extraToppings.setPrice(20);
								while (true) {
									System.out.println("Enter MUSHROOM QTY");
									int qty = scanner.nextInt();
									if (qty > 0) {
										extraToppings.setQty(qty);
										break;
									} else
										System.out.println("please enter valid QTY !");
								}
								orderList.add(extraToppings);

							} else if (choice == 2) {

								extraToppings.setName("MUSHROOM        ");
								extraToppings.setPrice(30);
								while (true) {
									System.out.println("Enter MUSHROOM QTY");
									int qty = scanner.nextInt();
									if (qty > 0) {
										extraToppings.setQty(qty);
										break;
									} else
										System.out.println("please enter valid QTY !");
								}
								orderList.add(extraToppings);

							} else if (choice == 3) {
								extraToppings.setName("EXTRA CHEESE    ");
								extraToppings.setPrice(25);
								while (true) {
									System.out.println("Enter EXTRA CHEESE QTY");
									int qty = scanner.nextInt();
									if (qty > 0) {
										extraToppings.setQty(qty);
										break;
									} else
										System.out.println("please enter valid QTY !");
								}

								orderList.add(extraToppings);

							} else if (choice == 4) {
								extraToppings.setName("ONION           ");
								extraToppings.setPrice(20);

								while (true) {
									System.out.println("Enter ONION QTY");
									int qty = scanner.nextInt();
									if (qty > 0) {
										extraToppings.setQty(qty);
										break;
									} else
										System.out.println("please enter valid QTY !");
								}

								orderList.add(extraToppings);

							} else if (choice == 5) {
								extraToppings.setName("GREEN PEPPER    ");
								extraToppings.setPrice(15);
								while (true) {
									System.out.println("Enter GREEN PEPPER QTY");
									int qty = scanner.nextInt();
									if (qty > 0) {
										extraToppings.setQty(qty);
										break;
									} else
										System.out.println("please enter valid QTY !");
								}

								orderList.add(extraToppings);

							} else {
								System.out.println("Please enter valid input !");
								continue;
							}

						} else {
							break;
						}
					}

					break;
				}
				case 2: {//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

					// burger space
					break;
				}
				case 3: {// Finger chips

					FingerChips fingerChips = new FingerChips();
					System.out.println("  * Please Choose FINGERCHIPS Size \n \n   1) HALF\n   2) FULL");
					int fingerchipsSize = scanner.nextInt();
					if (fingerchipsSize == 1) {
						System.out.println("  * Please Choose FINGERCHIPS QTY");
						int qty = scanner.nextInt();
						fingerChips.setQty(qty);
						fingerChips.setUnit("HALF");
						fingerChips.setPrice(60);
						fingerChips.setTotalPrice(qty * 60);

						orderList.add(fingerChips);

						break;

					} else if (fingerchipsSize == 2) {
						System.out.println("  * Please Choose FINGERCHIPS QTY");
						int qty = scanner.nextInt();
						fingerChips.setQty(qty);
						fingerChips.setUnit("FULL");
						fingerChips.setPrice(120);
						fingerChips.setTotalPrice(qty * 120);

						orderList.add(fingerChips);
						break;
					} else {
						System.out.println("please enter valid input !");
					}

				}
				case 4: {// coke

					Coke cock = new Coke();
					if (!isCockAvailable) {
						System.out.println("plz enter valid input___________");
						break;
					}

					System.out.println("  * Please Choose Cock Size \n");

					boolean is500mlCockAvailable = cockDao.is500mlCockAvailable();
					if (is500mlCockAvailable) {
						System.out.println("   1) 500ml");
					}
					boolean is1000mlCockAvailable = cockDao.is1000mlCockAvailable();
					if (is1000mlCockAvailable) {
						System.out.println("   2) 1000ml");
					}

					int cockSize = scanner.nextInt();
					if (cockSize == 1) {
						if (!is500mlCockAvailable) {
							System.out.println("plz enter valid input_________");
						}
						if (is500mlCockAvailable) {
							int availableCockCount = cockDao.getCockQty(1);

							while (true) {
								System.out.println("\n AVAILABLE COKE = " + availableCockCount);
								System.out.println("  * Please Choose Cock QTY");
								int qty = scanner.nextInt();

								if (qty <= availableCockCount) {

									cock.setId(1);
									cock.setQty(qty);
									cock.setUnit("500ml ");
									cock.setPrice(50);
									cock.setTotalPrice(qty * 50);

									orderList.add(cock);
									break;
								} else {
									System.out.println("PLZ ENTER VALID INPUT");
								}
							}
						}
					} else if (cockSize == 2) {

						if (!is1000mlCockAvailable) {
							System.out.println("plz enter valid input_________");

						}

						if (is1000mlCockAvailable) {
							int availableCockCount = cockDao.getCockQty(2);

							while (true) {
								System.out.println("\n AVAILABLE COKE = " + availableCockCount);
								System.out.println("  * Please Choose Cock QTY");
								int qty = scanner.nextInt();

								if (qty <= availableCockCount) {
									cock.setId(2);
									cock.setQty(qty);
									cock.setUnit("1000ml");
									cock.setPrice(100);
									cock.setTotalPrice(qty * 100);

									orderList.add(cock);
									break;
								} else {
									System.out.println("PLZ ENTER VALID INPUT");
								}
							}
						}
					} else
						System.out.println("plz enter valid input__________");
				}
					break;

				case 5: {
						return;
					
				}
				

				}

				boolean wantItems = true;
				while (wantItems) {
					System.out.println(
							"  * Want to order other PIZZA or BURGER or coke or Finger-Chips \n \n   1.Yes \n   2.No \n");
					int wantOtherPIZZAOrBURGEROrCOKEOrFingerchips = scanner.nextInt();
					if (wantOtherPIZZAOrBURGEROrCOKEOrFingerchips == 1) {
						wantItems = false;

					} else if (wantOtherPIZZAOrBURGEROrCOKEOrFingerchips == 2) {
						wantItems = false;
						wantPizzaOrBurger = false;
					} else
						System.out.println("Please Enter valid Input !");

				}
			}

			double totalAmount = pizzaShopConsoleDao.showOrderAndReturnTotalAmount(orderList);

			System.out.println("\n   1.PLACE ORDER \n   2.CANCEL ORDER");

			int desicion = scanner.nextInt();
			if (desicion == 1) {

				System.out.println("Please PAY (" + totalAmount + ") AMOUNT !");
				double payment = scanner.nextDouble();
				if (payment == totalAmount) {
					int orderNo = pizzaShopDataBaseOrdersDao.getOrderNo();

					Order order = accounts.createOrderBill(orderNo, orderList);

					

				} else if (payment > totalAmount) {
					int orderNo = pizzaShopDataBaseOrdersDao.getOrderNo();

					accounts.createOrderBill(orderNo, orderList);

					System.out.println("returning your Extra Money.....\n \n" + (payment - totalAmount));

					Order order = accounts.createOrderBill(orderNo, orderList);
					

				} else if (payment < totalAmount) {
					System.out.println(
							"Giving Last Chanse To Pay \n Please PAY (" + (totalAmount - payment) + ") AMOUNT !");
					double remainingPayment = scanner.nextDouble();

					if (remainingPayment == (totalAmount - payment)) {
						int orderNo = pizzaShopDataBaseOrdersDao.getOrderNo();
						
						Order order = accounts.createOrderBill(orderNo, orderList);
						

					} else if (remainingPayment > (totalAmount - payment)) {
						int orderNo = pizzaShopDataBaseOrdersDao.getOrderNo();

												
						Order order = accounts.createOrderBill(orderNo, orderList);
						

						System.out.println(
								"returning your Extra Money.....\n \n" + (remainingPayment - (totalAmount - payment)));
						

					} else {
						System.out.println("Your order hass been cancled \n returning your Payment \n "
								+ (payment + remainingPayment));
					}

				}
				{

				}

			} else if (desicion == 2) {

			} else if (desicion != 2) {
				System.out.println("   PLZ ENTER VALID INPUT");
			}

		}

	}
	

}
