package com.smartBazar.Controllers;

import com.smartBazar.Dao.CustomerDao;
import com.smartBazar.Dto.CustomerDto;

import java.sql.ResultSet;
import java.util.*;

public class Customer {

	public static void main(String[] args) throws Throwable {
		CustomerDto dto1 = new CustomerDto();
		CustomerDao dao1 = new CustomerDao();
		Scanner sc = new Scanner(System.in);
		int bill = 0;

		int kshirt = 250, kpant = 600, kslipers = 500, mshirt = 600, mpant = 1200, mshooe = 1000, ldress = 1000,
				lshoee = 1000, lslipers = 1000, lsaree = 1000, ricebag = 1200, dal = 100, salt = 30, oil = 120,
				mobile = 30000, earbuds = 2000, ipad = 1500, cricketbat = 500, teddybear = 500, toycar = 1000,
				pizza = 250, burgur = 200, thumsup = 100, apple = 120, banana = 60, tomato = 100, onion = 30;
		System.out.println();

		// System.out.println(" ------˜ ”*°•.˜”*°• WELCOME TO SMART BAZAR ONLINE SHOPING
		// •°*”˜.•°*”˜ ------");
		System.out.println("  █▓▒▒░░░ 𝗪𝗘𝗟𝗖𝗢𝗠𝗘 𝗧𝗢 𝗦𝗠𝗔𝗥𝗧 𝗕𝗔𝗭𝗔𝗥 𝗢𝗡𝗟𝗜𝗡𝗘 𝗦𝗛𝗢𝗣𝗜𝗡𝗚 ░░░▒▒▓█  ");

		System.out.println();
		System.out.println("1. 𝗙𝗼𝗿 𝘀𝗶𝗴𝗻𝗨𝗽");
		System.out.println("2. 𝗙𝗼𝗿 𝗹𝗼𝗴𝗶𝗻");
		System.out.println("3. 𝗧𝗼 𝗖𝗵𝗲𝗰𝗸 𝘄𝗮𝗹𝗹𝗲𝘁 𝗕𝗮𝗹𝗮𝗻𝗰𝗲");
		System.out.println("4. 𝗧𝗼 𝗔𝗱𝗱 𝗠𝗼𝗻𝗲𝘆  𝗜𝗻 𝘆𝗼𝘂𝗿 𝗪𝗮𝗹𝗹𝗲𝘁");
		System.out.println("5. 𝗙𝗼𝗿 𝗦𝗵𝗼𝗽𝗶𝗻𝗴");

		int userchoice = sc.nextInt();
		switch (userchoice) {
		// new register feature(case 1)
		case 1: {
			System.out.println("𝗣𝗹𝗲𝗮𝘀𝗲 𝗘𝗻𝘁𝗲𝗿 𝗬𝗼𝘂𝗿 𝗡𝗮𝗺𝗲");
			String name = sc.next();
			System.out.println("𝗣𝗹𝗲𝗮𝘀𝗲 𝗘𝗻𝘁𝗲𝗿  𝗬𝗼𝘂𝗿 𝗣𝗵𝗼𝗻𝗲");
			Long phone = sc.nextLong();
			System.out.println("𝗣𝗹𝗲𝗮𝘀𝗲  𝗘𝗻𝘁𝗲𝗿  𝗬𝗼𝘂𝗿 𝗘𝗺𝗮𝗶𝗹");
			String email = sc.next();
			System.out.println("𝗣𝗹𝗲𝗮𝘀𝗲  𝗘𝗻𝘁𝗲𝗿  𝗬𝗼𝘂𝗿 𝗣𝗮𝘀𝘀𝘄𝗼𝗿𝗱");
			String pwd = sc.next();
			System.out.println("𝗣𝗹𝗲𝗮𝘀𝗲 𝗘𝗻𝘁𝗲𝗿  𝗠𝗼𝗻𝗲𝘆  𝗧𝗼 𝗔𝗱𝗱 𝗪𝗮𝗹𝗹𝗲𝘁  ");
			Long wallet = sc.nextLong();

			dto1.setName(name);
			dto1.setEmail(email);
			dto1.setPhone(phone);
			dto1.setPassword(pwd);
			dto1.setWallet(wallet);

			dao1.signup(dto1);
			System.out.println("𝗗𝗲𝗮𝗿 " + name + " 𝗬𝗼𝘂𝗿 𝗥𝗲𝗴𝗶𝘀𝘁𝗿𝗮𝘁𝗶𝗼𝗻 𝗶𝘀 𝘀𝘂𝗰𝗰𝗲𝘀𝘀");

		}
			// new register feature(case 1)
			break;

		// login feature Started(case3)
		case 2: {

			System.out.println("𝗣𝗹𝗲𝗮𝘀𝗲  𝗘𝗻𝘁𝗲𝗿  𝗬𝗼𝘂𝗿 𝗘𝗺𝗮𝗶𝗹");
			String email = sc.next();

			System.out.println("𝗣𝗹𝗲𝗮𝘀𝗲  𝗘𝗻𝘁𝗲𝗿  𝗬𝗼𝘂𝗿 𝗣𝗮𝘀𝘀𝘄𝗼𝗿𝗱");
			String pwd = sc.next();

			dto1.setEmail(email);
			dto1.setPassword(pwd);

			boolean login = dao1.login(dto1);

			if (login) {
				System.out.println("𝗧𝗵𝗮𝗻𝗸 𝘆𝗼𝘂..!! 𝗬𝗼𝘂𝗿 𝗟𝗼𝗴𝗶𝗻 𝘀𝘂𝗰𝗰𝗲𝘀𝘀");

				System.out.println("𝗗𝗼 𝗬𝗼𝘂 𝗪𝗮𝗻𝘁 𝗧𝗼 𝗖𝗵𝗲𝗰𝗸 𝗧𝗵𝗲 𝗬𝗼𝘂𝗿  𝗪𝗮𝗹𝗹𝗲𝘁 𝗕𝗮𝗹𝗮𝗻𝗰𝗲 𝗘𝗻𝘁𝗲𝗿 𝗬𝗲𝘀 𝗢𝗿 𝗡𝗼");
				String balnaceCheck = sc.next();

				switch (balnaceCheck) {
				case "yes": {
					System.out.println("𝗣𝗹𝗲𝗮𝘀𝗲  𝗘𝗻𝘁𝗲𝗿  𝗬𝗼𝘂𝗿 𝗘𝗺𝗮𝗶𝗹");
					String blanceemail = sc.next();

					System.out.println("𝗣𝗹𝗲𝗮𝘀𝗲  𝗘𝗻𝘁𝗲𝗿  𝗬𝗼𝘂𝗿 𝗣𝗮𝘀𝘀𝘄𝗼𝗿𝗱");
					String blanceemailpas = sc.next();

					dto1.setEmail(blanceemail);
					dto1.setPassword(blanceemailpas);

					double res = dao1.getwalletData(dto1);
					System.out.println("𝗬𝗼𝘂𝗿 𝗖𝘂𝗿𝗿𝗲𝗻𝘁 𝗪𝗮𝗹𝗹𝗲𝘁 𝗕𝗮𝗹𝗮𝗻𝗰𝗲 𝗶𝘀 " + res);

				}

					break;

				case "no": {
					System.out.println("𝗧𝗵𝗮𝗻𝗸 𝘆𝗼𝘂....!!!");
				}

				}
			}

			else {
				System.out.println("𝗦𝗼𝗿𝗿𝘆 𝗬𝗼𝘂 𝗗𝗼𝗻'𝘁 𝗛𝗮𝘃𝗲 𝗔𝗻𝘆 𝗔𝗰𝗰𝗼𝘂𝗻𝘁 𝗣𝗹𝗲𝗮𝘀𝗲 𝗞𝗶𝗻𝗱𝗹𝘆 𝗥𝗶𝗴𝗲𝘀𝘁𝗲𝗿");
			}

		}

			// login feature ended(case2)
			break;

		// Balance checking feature started(case 3)
		case 3: {
			System.out.println("𝗧𝗼 𝗖𝗵𝗲𝗰𝗸 𝗬𝗼𝘂𝗿  𝗪𝗮𝗹𝗹𝗲𝘁 𝗕𝗮𝗹𝗮𝗻𝗰𝗲 𝗣𝗹𝗲𝗮𝘀𝗲 𝗟𝗼𝗴𝗶𝗻 𝗪𝗶𝘁𝗵 𝘆𝗼𝘂𝗿 𝗘𝗺𝗮𝗶𝗹&𝗣𝗮𝘀𝘀𝘄𝗼𝗿𝗱 ");
			System.out.println("𝗣𝗹𝗲𝗮𝘀𝗲  𝗘𝗻𝘁𝗲𝗿  𝗬𝗼𝘂𝗿 𝗘𝗺𝗮𝗶𝗹");
			String email = sc.next();

			System.out.println("𝗣𝗹𝗲𝗮𝘀𝗲  𝗘𝗻𝘁𝗲𝗿  𝗬𝗼𝘂𝗿 𝗣𝗮𝘀𝘀𝘄𝗼𝗿𝗱");
			String pwd = sc.next();

			dto1.setEmail(email);
			dto1.setPassword(pwd);

			boolean login = dao1.login(dto1);

			if (login) {
				System.out.println("𝗬𝗼𝘂𝗿 𝗟𝗼𝗴𝗶𝗻 𝗶𝘀 𝘀𝘂𝗰𝗰𝗲𝘀𝘀");
				System.out.println("𝗧𝗵𝗮𝗻𝗸 𝘆𝗼𝘂....!!!");

				System.out.println("𝗗𝗼 𝗬𝗼𝘂 𝗪𝗮𝗻𝘁 𝗧𝗼 𝗖𝗵𝗲𝗰𝗸 𝗧𝗵𝗲 𝗬𝗼𝘂𝗿  𝗪𝗮𝗹𝗹𝗲𝘁 𝗕𝗮𝗹𝗮𝗻𝗰𝗲 𝗘𝗻𝘁𝗲𝗿 𝗬𝗲𝘀 𝗢𝗿 𝗡𝗼");
				String balnaceCheck = sc.next();

				switch (balnaceCheck) {
				case "yes": {
					System.out.println("𝗣𝗹𝗲𝗮𝘀𝗲  𝗘𝗻𝘁𝗲𝗿  𝗬𝗼𝘂𝗿 𝗘𝗺𝗮𝗶𝗹");
					String blanceemail = sc.next();

					System.out.println("𝗣𝗹𝗲𝗮𝘀𝗲  𝗘𝗻𝘁𝗲𝗿  𝗬𝗼𝘂𝗿 𝗣𝗮𝘀𝘀𝘄𝗼𝗿𝗱");
					String blanceemailpas = sc.next();

					dto1.setEmail(blanceemail);
					dto1.setPassword(blanceemailpas);

					double res = dao1.getwalletData(dto1);
					System.out.println("𝗬𝗼𝘂𝗿 𝗖𝘂𝗿𝗿𝗲𝗻𝘁 𝗪𝗮𝗹𝗹𝗲𝘁 𝗕𝗮𝗹𝗮𝗻𝗰𝗲 𝗶𝘀 " + res);
					System.out.println("𝗧𝗵𝗮𝗻𝗸 𝘆𝗼𝘂....!!!");

				}
					break;
				case "no": {
					System.out.println("𝗧𝗵𝗮𝗻𝗸 𝘆𝗼𝘂....!!!");

				}

				}
				break;
			}

			else {
				System.out.println("𝗦𝗼𝗿𝗿𝘆 𝗬𝗼𝘂 𝗗𝗼𝗻'𝘁 𝗛𝗮𝘃𝗲 𝗔𝗻𝘆 𝗔𝗰𝗰𝗼𝘂𝗻𝘁 𝗣𝗹𝗲𝗮𝘀𝗲 𝗞𝗶𝗻𝗱𝗹𝘆 𝗥𝗶𝗴𝗲𝘀𝘁𝗲𝗿");
				System.out.println("𝗧𝗵𝗮𝗻𝗸 𝘆𝗼𝘂....!!!");
			}

		}
			break;
		// Balance checking feature ended (case 3)
		case 4: {
			System.out.println("𝗧𝗢 𝗔𝗗𝗗  𝗕𝗔𝗟𝗔𝗡𝗖𝗘 𝗜𝗡𝗧𝗢 𝗬𝗢𝗨𝗥 𝗪𝗔𝗟𝗟𝗘𝗧  𝗣𝗟𝗘𝗔𝗦𝗘  𝗟𝗢𝗚𝗜𝗡 ");
			System.out.println("𝗣𝗹𝗲𝗮𝘀𝗲  𝗘𝗻𝘁𝗲𝗿  𝗬𝗼𝘂𝗿 𝗘𝗺𝗮𝗶𝗹");
			String email = sc.next();

			System.out.println("𝗣𝗹𝗲𝗮𝘀𝗲  𝗘𝗻𝘁𝗲𝗿  𝗬𝗼𝘂𝗿 𝗣𝗮𝘀𝘀𝘄𝗼𝗿𝗱");
			String pwd = sc.next();

			dto1.setEmail(email);
			dto1.setPassword(pwd);

			boolean login = dao1.login(dto1);

			if (login) {
				System.out.println("𝗬𝗼𝘂𝗿 𝗟𝗼𝗴𝗶𝗻 𝗶𝘀 𝘀𝘂𝗰𝗰𝗲𝘀𝘀");
				System.out.println("𝗧𝗵𝗮𝗻𝗸 𝘆𝗼𝘂....!!!");

				System.out.println("𝗘𝗻𝘁𝗲𝗿 𝗠𝗼𝗻𝗲𝘆 𝗧𝗼 𝗔𝗱𝗱 𝗪𝗮𝗹𝗹𝗲𝘁 ");
				Long wallet = sc.nextLong();

				dto1.setEmail(email);

				dto1.setPassword(pwd);

				double res = dao1.getwalletData(dto1);

				double finalamount = res + wallet;

				dto1.setEmail(email);
				dto1.setPassword(pwd);
				dto1.setWallet(finalamount);

				dao1.updateWallet(dto1);
				System.out.println(" 𝗦𝘂𝗰𝗲𝘀𝘀𝗳𝘂𝗹𝗹𝘆 𝗮𝗱𝗱𝗲𝗱 𝗺𝗼𝗻𝗲𝘆 𝗶𝗻𝘁𝗼 𝘄𝗮𝗹𝗹𝗲𝘁 ");
				double walletAmout = dao1.getwalletData(dto1);
				System.out.println("𝗬𝗼𝘂𝗿 𝗖𝘂𝗿𝗿𝗲𝗻𝘁 𝗪𝗮𝗹𝗹𝗲𝘁 𝗕𝗮𝗹𝗮𝗻𝗰𝗲 𝗶𝘀" + walletAmout);
				System.out.println("𝗧𝗵𝗮𝗻𝗸 𝘆𝗼𝘂....!!!");

			}

			else {
				System.out.println("𝗦𝗼𝗿𝗿𝘆 𝗬𝗼𝘂 𝗗𝗼𝗻'𝘁 𝗛𝗮𝘃𝗲 𝗔𝗻𝘆 𝗔𝗰𝗰𝗼𝘂𝗻𝘁 𝗣𝗹𝗲𝗮𝘀𝗲 𝗞𝗶𝗻𝗱𝗹𝘆 𝗥𝗶𝗴𝗲𝘀𝘁𝗲𝗿");
				System.out.println("𝗧𝗵𝗮𝗻𝗸 𝘆𝗼𝘂....!!!");
			}

		}
		break;

		case 5: {
			boolean flag=true;
			while (flag) {
				System.out.println("𝗗𝗲𝗮𝗿 𝗖𝘂𝘀𝘁𝗼𝗺𝗲𝗿 𝗧𝗼 𝗖𝗼𝗻𝘁𝗶𝘂𝗲 𝗦𝗵𝗼𝗽𝗶𝗻𝗴 𝗣𝗹𝗲𝗮𝘀𝗲 𝗟𝗼𝗴𝗶𝗻 𝗪𝗶𝘁𝗵 𝗘𝗺𝗮𝗶𝗹&𝗣𝗮𝘀𝘀𝘄𝗼𝗿𝗱");

				System.out.println("𝗣𝗹𝗲𝗮𝘀𝗲  𝗘𝗻𝘁𝗲𝗿  𝗬𝗼𝘂𝗿 𝗘𝗺𝗮𝗶𝗹");
				String email = sc.next();

				System.out.println("𝗣𝗹𝗲𝗮𝘀𝗲  𝗘𝗻𝘁𝗲𝗿  𝗬𝗼𝘂𝗿 𝗣𝗮𝘀𝘀𝘄𝗼𝗿𝗱");
				String pwd = sc.next();

				dto1.setEmail(email);
				dto1.setPassword(pwd);

				boolean login = dao1.login(dto1);

				if (login) {
					System.out.println("𝗬𝗼𝘂𝗿 𝗟𝗼𝗴𝗶𝗻 𝗶𝘀 𝘀𝘂𝗰𝗰𝗲𝘀𝘀");

					System.out.println("𝗦𝗲𝗹𝗲𝗰𝘁 𝗙𝗿𝗼𝗺 𝗕𝗲𝗹𝗼𝘄 𝗼𝗽𝘁𝗶𝗼𝗻𝘀");

					System.out.println("1 𝗙𝗼𝗿 𝗙𝗮𝘀𝗵𝗼𝗻 𝗦𝘁𝗼𝗿𝗲");
					System.out.println("2 𝗙𝗼𝗿 𝗣𝗿𝗼𝘃𝗶𝘀𝗶𝗼𝗻𝘀 𝗦𝘁𝗼𝗿𝗲");
					System.out.println("3 𝗙𝗼𝗿 𝗘𝗹𝗲𝗰𝘁𝗿𝗼𝗻𝗶𝗰𝘀 𝗦𝘁𝗼𝗿𝗲");
					System.out.println("4 𝗙𝗼𝗿 𝗸𝗶𝗱𝘀𝗧𝗼𝘆𝘀 𝗦𝘁𝗼𝗿𝗲");
					System.out.println("5 𝗙𝗼𝗿 𝗦𝗻𝗮𝗸𝗲𝘀& 𝗕𝗲𝘃𝗲𝗿𝗴𝗲𝘀");
					System.out.println("6.𝗙𝗼𝗿  𝗙𝗿𝘂𝗶𝘁𝘀 𝗮𝗻𝗱 𝘃𝗲𝗴𝗲𝘁𝗮𝗯𝗹𝗲𝘀 𝘀𝘁𝗼𝗿𝗲");

					int shopingChoice = sc.nextInt();

					switch (shopingChoice) {

					case 1: {
						System.out.println("𝗦𝗲𝗹𝗲𝗰𝘁 𝗙𝗿𝗼𝗺 𝗕𝗲𝗹𝗼𝘄 𝗼𝗽𝘁𝗶𝗼𝗻𝘀");
						System.out.println("1 𝗙𝗼𝗿 𝗸𝗶𝗱𝘀 𝘀𝗵𝗼𝗽𝗶𝗻𝗴");
						System.out.println("2 𝗙𝗼𝗿 𝗠𝗲𝗻𝘀 𝘀𝗵𝗼𝗽𝗶𝗻𝗴");
						System.out.println("3 𝗙𝗼𝗿 𝘄𝗼𝗺𝗲𝗻𝘀 𝘀𝗵𝗼𝗽𝗶𝗻𝗴");
						int fashonechoice = sc.nextInt();
						switch (fashonechoice) {

						case 1: {
							System.out.println("𝗪𝗲𝗹𝗰𝗼𝗺 𝗧𝗼 𝗞𝗶𝗱𝘀 𝗦𝗵𝗼𝗽𝗶𝗻𝗴");
							System.out.println("1 𝗦𝗵𝗶𝗿𝘁-----250/-");
							System.out.println("2 𝗽𝗮𝗻𝘁-----600/-");
							System.out.println("3 𝗧𝗼 𝗚𝗲𝗻𝗲𝗿𝗮𝘁𝗲 𝗕𝗶𝗹𝗹");

							int menswereitem = sc.nextInt();
							switch (menswereitem) {
							case 1: {
								bill = bill + kshirt;
							}
								break;
							case 2: {
								bill = bill + kpant;
							}
								break;

							case 3: {
								dto1.setEmail(email);

								dto1.setPassword(pwd);

								double res = dao1.getwalletData(dto1);
								double price = bill;
								double finalamount = res - (bill);
								if (res > price) {
									dto1.setEmail(email);
									dto1.setPassword(pwd);
									dto1.setWallet(finalamount);

									dao1.updateWallet(dto1);
									double walletAmout = dao1.getwalletData(dto1);
									System.out.println("𝗬𝗼𝘂𝗿 𝗕𝗶𝗹𝗹 𝗶𝘀 :"+bill);
									System.out.println("𝗬𝗼𝘂𝗿 𝗖𝘂𝗿𝗿𝗲𝗻𝘁 𝗪𝗮𝗹𝗹𝗲𝘁 𝗕𝗮𝗹𝗮𝗻𝗰𝗲 𝗶𝘀 :" + walletAmout);
									System.out.println("𝗧𝗵𝗮𝗻𝗸 𝘆𝗼𝘂....!!!");

									flag=false;
								}
								else {
									System.out.println("𝙞𝙣𝙨𝙪𝙛𝙛𝙞𝙘𝙞𝙚𝙣𝙩 𝙛𝙪𝙣𝙙 𝙬𝙚 𝙘𝙖𝙣'𝙩 𝙥𝙧𝙤𝙘𝙚𝙨𝙨 𝙥𝙖𝙮𝙢𝙚𝙣𝙩");
								}
							}

							}

						}
							// mans store completed

							break;
							
							//
						case 2: {
							System.out.println("𝗪𝗲𝗹𝗰𝗼𝗺 𝘁𝗼 𝗠𝗲𝗻𝘀 𝗦𝗵𝗼𝗽𝗶𝗻𝗴");
							System.out.println("𝗦𝗲𝗹𝗲𝗰𝘁 𝗙𝗿𝗼𝗺 𝗕𝗲𝗹𝗼𝘄 𝗼𝗽𝘁𝗶𝗼𝗻𝘀");
							System.out.println("1 𝗦𝗵𝗶𝗿𝘁-----600/-");
							System.out.println("2 𝗽𝗮𝗻𝘁-------1200/-");
							System.out.println("3.𝗧𝗼 𝗚𝗲𝗻𝗲𝗿𝗮𝘁𝗲 𝗕𝗶𝗹𝗹");

							int menswereitem = sc.nextInt();
							switch (menswereitem) {
							case 1: {
								bill = bill + mshirt;
							}
								break;
							case 2: {
								bill = bill + mpant;
							}
								break;

							case 3: {
								dto1.setEmail(email);

								dto1.setPassword(pwd);

								double res = dao1.getwalletData(dto1);
								double price = bill;
								double finalamount = res - (bill);
								if (res > price) {
									dto1.setEmail(email);
									dto1.setPassword(pwd);
									dto1.setWallet(finalamount);

									dao1.updateWallet(dto1);
									double walletAmout = dao1.getwalletData(dto1);
									System.out.println("𝗬𝗼𝘂𝗿 𝗕𝗶𝗹𝗹 𝗶𝘀 :"+bill);
									System.out.println("𝗬𝗼𝘂𝗿 𝗖𝘂𝗿𝗿𝗲𝗻𝘁 𝗪𝗮𝗹𝗹𝗲𝘁 𝗕𝗮𝗹𝗮𝗻𝗰𝗲 𝗶𝘀 :" + walletAmout);
									System.out.println("𝗧𝗵𝗮𝗻𝗸 𝘆𝗼𝘂....!!!");

									flag=false;
								}
								else {
									System.out.println("𝙞𝙣𝙨𝙪𝙛𝙛𝙞𝙘𝙞𝙚𝙣𝙩 𝙛𝙪𝙣𝙙 𝙬𝙚 𝙘𝙖𝙣'𝙩 𝙥𝙧𝙤𝙘𝙚𝙨𝙨 𝙥𝙖𝙮𝙢𝙚𝙣𝙩");
								}
							}

							}

						}
						break;
							//
						case 3: {
							System.out.println("𝗪𝗲𝗹𝗰𝗼𝗺 𝘁𝗼 𝗟𝗮𝗱𝗶𝗲𝘀 𝗦𝗵𝗼𝗽𝗶𝗻𝗴 𝗦𝗲𝗰𝘁𝗶𝗼𝗻");
							System.out.println("𝗦𝗲𝗹𝗲𝗰𝘁 𝗙𝗿𝗼𝗺 𝗕𝗲𝗹𝗼𝘄 𝗼𝗽𝘁𝗶𝗼𝗻𝘀");
							System.out.println("1.𝗗𝗿𝗲𝘀𝘀-----1000/-");
							System.out.println("2.𝘀𝗵𝗼𝗲𝗲𝘀-------1000/-");
							System.out.println("3. 𝗧𝗼𝗚𝗲𝗻𝗲𝗿𝗮𝘁𝗲 𝗕𝗶𝗹𝗹");
							int lchoice = sc.nextInt();
							switch (lchoice) {
							case 1: {
								bill = bill + ldress;
							}
								break;
							case 2: {
								bill = bill + lshoee;
							}
								break;
							case 3: {
								dto1.setEmail(email);

								dto1.setPassword(pwd);

								double res = dao1.getwalletData(dto1);
								double price = bill;
								double finalamount = res - (bill);
								if (res > price) {
									dto1.setEmail(email);
									dto1.setPassword(pwd);
									dto1.setWallet(finalamount);

									dao1.updateWallet(dto1);
									double walletAmout = dao1.getwalletData(dto1);
									System.out.println("𝗬𝗼𝘂𝗿 𝗕𝗶𝗹𝗹 𝗶𝘀 :"+bill);
									System.out.println("𝗬𝗼𝘂𝗿 𝗖𝘂𝗿𝗿𝗲𝗻𝘁 𝗪𝗮𝗹𝗹𝗲𝘁 𝗕𝗮𝗹𝗮𝗻𝗰𝗲 𝗶𝘀 :" + walletAmout);
									System.out.println("𝗧𝗵𝗮𝗻𝗸 𝘆𝗼𝘂....!!!");

									flag=false;
								}
								else {
									System.out.println("𝙞𝙣𝙨𝙪𝙛𝙛𝙞𝙘𝙞𝙚𝙣𝙩 𝙛𝙪𝙣𝙙 𝙬𝙚 𝙘𝙖𝙣'𝙩 𝙥𝙧𝙤𝙘𝙚𝙨𝙨 𝙥𝙖𝙮𝙢𝙚𝙣𝙩");
								}
							}

							}

						}

							break;

						}

					}
					break;
					case 2: {
						System.out.println("𝗪𝗲𝗹𝗰𝗼𝗺𝗲  𝗧𝗼 𝗣𝗿𝗼𝘃𝗶𝘀𝗶𝗼𝗻 𝗦𝘁𝗼𝗿𝗲");
						System.out.println("𝗦𝗲𝗹𝗲𝗰𝘁 𝗙𝗿𝗼𝗺 𝗕𝗲𝗹𝗼𝘄 𝗼𝗽𝘁𝗶𝗼𝗻𝘀");
						System.out.println("1.𝗥𝗶𝗰𝗲 𝗯𝗮𝗴----1200/-");
						System.out.println("2.𝗗𝗮𝗹(1𝗸𝗴)----100/-");
						System.out.println("3.𝘀𝗮𝗹𝘁 (1𝗸𝗴)---30/-");
						System.out.println("4.𝗢𝗶𝗹(1𝗸𝗴)------------120");
						System.out.println("5.𝗧𝗼 𝗚𝗲𝗻𝗲𝗿𝗮𝘁𝗲 𝗕𝗶𝗹𝗹");
						int pchoice = sc.nextInt();

						switch (pchoice) {

						case 1: {
							bill = bill + ricebag;

						}
						case 2: {
							bill = bill + dal;
						}
							break;
						case 3: {
							bill = bill + salt;
						}
							break;
						case 4: {
							bill = bill + oil;
						}
							break;
						case 5: {
							dto1.setEmail(email);

							dto1.setPassword(pwd);

							double res = dao1.getwalletData(dto1);
							double price = bill;
							double finalamount = res - (bill);
							if (res > price) {
								dto1.setEmail(email);
								dto1.setPassword(pwd);
								dto1.setWallet(finalamount);

								dao1.updateWallet(dto1);
								double walletAmout = dao1.getwalletData(dto1);
								System.out.println("𝗬𝗼𝘂𝗿 𝗕𝗶𝗹𝗹 𝗶𝘀 :"+bill);
								System.out.println("𝗬𝗼𝘂𝗿 𝗖𝘂𝗿𝗿𝗲𝗻𝘁 𝗪𝗮𝗹𝗹𝗲𝘁 𝗕𝗮𝗹𝗮𝗻𝗰𝗲 𝗶𝘀 :" + walletAmout);
								System.out.println("𝗧𝗵𝗮𝗻𝗸 𝘆𝗼𝘂....!!!");

								flag=false;

							}
							else {
								System.out.println("𝙞𝙣𝙨𝙪𝙛𝙛𝙞𝙘𝙞𝙚𝙣𝙩 𝙛𝙪𝙣𝙙 𝙬𝙚 𝙘𝙖𝙣'𝙩 𝙥𝙧𝙤𝙘𝙚𝙨𝙨 𝙥𝙖𝙮𝙢𝙚𝙣𝙩");
							}

						}

						}

					}
					break;
					case 3: {
						System.out.println("𝗪𝗲𝗹𝗰𝗼𝗺 𝗧𝗼 𝗘𝗹𝗲𝗰𝘁𝗿𝗼𝗻𝗶𝗰 𝘀𝘁𝗼𝗿𝗲");
						System.out.println("𝗦𝗲𝗹𝗲𝗰𝘁 𝗙𝗿𝗼𝗺 𝗕𝗲𝗹𝗼𝘄 𝗼𝗽𝘁𝗶𝗼𝗻𝘀");
						System.out.println("1. 𝗠𝗼𝗯𝗶𝗹𝗲-------30000/-");
						System.out.println("2. 𝗘𝗮𝗿𝗽𝗯𝘂𝗱𝘀----2000/-");
						System.out.println("3. 𝗜𝗽𝗮𝗱-----15000/-");
						System.out.println("4.𝗧𝗼 𝗚𝗲𝗻𝗲𝗿𝗮𝘁𝗲 𝗕𝗶𝗹𝗹");
						int echoice = sc.nextInt();
						switch (echoice) {
						case 1: {
							bill = bill + mobile;
						}
							break;
						case 2: {
							bill = bill + earbuds;
						}
							break;
						case 3: {
							bill = bill + ipad;
						}
							break;
						case 4: {
							dto1.setEmail(email);

							dto1.setPassword(pwd);

							double res = dao1.getwalletData(dto1);
							double price = bill;
							double finalamount = res - (bill);
							if (res > price) {
								dto1.setEmail(email);
								dto1.setPassword(pwd);
								dto1.setWallet(finalamount);

								dao1.updateWallet(dto1);
								double walletAmout = dao1.getwalletData(dto1);
								System.out.println("𝗬𝗼𝘂𝗿 𝗕𝗶𝗹𝗹 𝗶𝘀 :"+bill);
								System.out.println("𝗬𝗼𝘂𝗿 𝗖𝘂𝗿𝗿𝗲𝗻𝘁 𝗪𝗮𝗹𝗹𝗲𝘁 𝗕𝗮𝗹𝗮𝗻𝗰𝗲 𝗶𝘀 :" + walletAmout);
								System.out.println("𝗧𝗵𝗮𝗻𝗸 𝘆𝗼𝘂....!!!");

								flag=false;
							}
							else {
								System.out.println("𝙞𝙣𝙨𝙪𝙛𝙛𝙞𝙘𝙞𝙚𝙣𝙩 𝙛𝙪𝙣𝙙 𝙬𝙚 𝙘𝙖𝙣'𝙩 𝙥𝙧𝙤𝙘𝙚𝙨𝙨 𝙥𝙖𝙮𝙢𝙚𝙣𝙩");
							}

						}

						}

					}
						break;
					case 4: {
						System.out.println("𝘄𝗲𝗹𝗰𝗼𝗺𝗲 𝘁𝗼 𝘁𝗼𝘆𝗲𝘀 𝘀𝘁𝗼𝗿𝗲");
						System.out.println("𝗦𝗲𝗹𝗲𝗰𝘁 𝗙𝗿𝗼𝗺 𝗕𝗲𝗹𝗼𝘄 𝗼𝗽𝘁𝗶𝗼𝗻𝘀");
						System.out.println("1. 𝗖𝗿𝗶𝗰𝗸𝗲𝘁-𝗯𝗮𝘁-----500/-");
						System.out.println("2. 𝗧𝗲𝗱𝗱𝗮𝘆𝗕𝗲𝗮𝗿------500/-");
						System.out.println("3. 𝗧𝗼𝘆𝗰𝗮𝗿----------100/-");
						System.out.println("4.𝗧𝗼 𝗚𝗲𝗻𝗲𝗿𝗮𝘁𝗲 𝗕𝗶𝗹𝗹");
						int echoice = sc.nextInt();
						switch (echoice) {
						case 1: {
							bill = bill + cricketbat;
						}
							break;
						case 2: {
							bill = bill + teddybear;
						}
							break;
						case 3: {
							bill = bill + toycar;
						}
							break;
						case 4: {

							dto1.setEmail(email);

							dto1.setPassword(pwd);

							double res = dao1.getwalletData(dto1);
							double price = bill;
							double finalamount = res - (bill);
							if (res > price) {
								dto1.setEmail(email);
								dto1.setPassword(pwd);
								dto1.setWallet(finalamount);

								dao1.updateWallet(dto1);
								double walletAmout = dao1.getwalletData(dto1);
								System.out.println("𝗬𝗼𝘂𝗿 𝗕𝗶𝗹𝗹 𝗶𝘀 :"+bill);
								System.out.println("𝗬𝗼𝘂𝗿 𝗖𝘂𝗿𝗿𝗲𝗻𝘁 𝗪𝗮𝗹𝗹𝗲𝘁 𝗕𝗮𝗹𝗮𝗻𝗰𝗲 𝗶𝘀 :" + walletAmout);
								System.out.println("𝗧𝗵𝗮𝗻𝗸 𝘆𝗼𝘂....!!!");

								flag=false;

							}
							else {
								System.out.println("𝙞𝙣𝙨𝙪𝙛𝙛𝙞𝙘𝙞𝙚𝙣𝙩 𝙛𝙪𝙣𝙙 𝙬𝙚 𝙘𝙖𝙣'𝙩 𝙥𝙧𝙤𝙘𝙚𝙨𝙨 𝙥𝙖𝙮𝙢𝙚𝙣𝙩");
							}

						}

						}
					}
						break;
					case 5: {
						System.out.println("𝗪𝗲𝗹𝗰𝗼𝗺𝗲 𝘁𝗼 𝗦𝗻𝗮𝗸𝗲𝘀&𝗕𝗲𝘃𝗲𝗿𝗮𝗴𝗲𝘀");
						System.out.println("𝗦𝗲𝗹𝗲𝗰𝘁 𝗙𝗿𝗼𝗺 𝗕𝗲𝗹𝗼𝘄 𝗼𝗽𝘁𝗶𝗼𝗻𝘀");
						System.out.println("1. 𝗣𝗶𝘇𝘇𝗮-----250/-");
						System.out.println("2. 𝗕𝘂𝗿𝗴𝘂𝗿------200/-");
						System.out.println("3. 𝗧𝗵𝘂𝗺𝘀-𝗨𝗽----------100/-");
						System.out.println("4. 𝗧𝗼 𝗚𝗲𝗻𝗲𝗿𝗮𝘁𝗲 𝗕𝗶𝗹𝗹");
						int echoice = sc.nextInt();
						switch (echoice) {
						case 1: {
							bill = bill + pizza;
						}
							break;
						case 2: {
							bill = bill + burgur;
						}
							break;
						case 3: {
							bill = bill + thumsup;
						}

							break;
						case 4: {

							dto1.setEmail(email);

							dto1.setPassword(pwd);

							double res = dao1.getwalletData(dto1);
							double price = bill;
							
							double finalamount = res - (bill);
							if (res > price) {
								dto1.setEmail(email);
								dto1.setPassword(pwd);
								dto1.setWallet(finalamount);

								dao1.updateWallet(dto1);
								double walletAmout = dao1.getwalletData(dto1);
								System.out.println("𝗬𝗼𝘂𝗿 𝗕𝗶𝗹𝗹 𝗶𝘀 :"+bill);
								System.out.println("𝗬𝗼𝘂𝗿 𝗖𝘂𝗿𝗿𝗲𝗻𝘁 𝗪𝗮𝗹𝗹𝗲𝘁 𝗕𝗮𝗹𝗮𝗻𝗰𝗲 𝗶𝘀 : " + walletAmout);
								System.out.println("𝗧𝗵𝗮𝗻𝗸 𝘆𝗼𝘂....!!!");

								flag=false;

							}
							else {
								System.out.println("𝙞𝙣𝙨𝙪𝙛𝙛𝙞𝙘𝙞𝙚𝙣𝙩 𝙛𝙪𝙣𝙙 𝙬𝙚 𝙘𝙖𝙣'𝙩 𝙥𝙧𝙤𝙘𝙚𝙨𝙨 𝙥𝙖𝙮𝙢𝙚𝙣𝙩");
							}

						}

						}
					}
						break;
					case 6: {
						System.out.println("𝗪𝗲𝗹𝗰𝗼𝗺𝗲 𝗧𝗼 𝗙𝗿𝘂𝗶𝘁𝘀&𝘃𝗲𝗴𝗲𝘁𝗮𝗯𝗹𝗲𝘀 𝗦𝗲𝗰𝘁𝗶𝗼𝗻");
						System.out.println("𝗦𝗲𝗹𝗲𝗰𝘁 𝗙𝗿𝗼𝗺 𝗕𝗲𝗹𝗼𝘄 𝗼𝗽𝘁𝗶𝗼𝗻𝘀");
						System.out.println("1. 𝗔𝗽𝗽𝗹𝗲 (1𝗸𝗴)-----120/-");
						System.out.println("2. 𝗕𝗮𝗻𝗮𝗻𝗮----------60/-");
						System.out.println("3. 𝗧𝗼𝗺𝗮𝘁𝗼----------100/-");
						System.out.println("4. 𝗢𝗻𝗶𝗼𝗻(1𝗸𝗴) ------------30/-");
						System.out.println("5. 𝗧𝗼 𝗚𝗲𝗻𝗲𝗿𝗮𝘁𝗲 𝗕𝗶𝗹𝗹");
						int echoice = sc.nextInt();
						switch (echoice) {
						case 1: {
							bill = bill + apple;
						}
							break;
						case 2: {
							bill = bill + banana;
						}
							break;
						case 3: {
							bill = bill + tomato;
						}
							break;
						case 4: {
							bill = bill + onion;
						}
						break;
						case 5: {

							dto1.setEmail(email);

							dto1.setPassword(pwd);

							double res = dao1.getwalletData(dto1);
							double price = bill;
							double finalamount = res - (bill);
							if (res > price) {
								dto1.setEmail(email);
								dto1.setPassword(pwd);
								dto1.setWallet(finalamount);

								dao1.updateWallet(dto1);
								double walletAmout = dao1.getwalletData(dto1);
								System.out.println("𝗬𝗼𝘂𝗿 𝗕𝗶𝗹𝗹 𝗶𝘀 :"+bill);
								System.out.println("𝗬𝗼𝘂𝗿 𝗖𝘂𝗿𝗿𝗲𝗻𝘁 𝗪𝗮𝗹𝗹𝗲𝘁 𝗕𝗮𝗹𝗮𝗻𝗰𝗲 𝗶𝘀 : " + walletAmout);
								System.out.println("𝗧𝗵𝗮𝗻𝗸 𝘆𝗼𝘂....!!!");

								flag=false;

							}
							else {
								System.out.println("𝙞𝙣𝙨𝙪𝙛𝙛𝙞𝙘𝙞𝙚𝙣𝙩 𝙛𝙪𝙣𝙙 𝙬𝙚 𝙘𝙖𝙣'𝙩 𝙥𝙧𝙤𝙘𝙚𝙨𝙨 𝙥𝙖𝙮𝙢𝙚𝙣𝙩");
							}
							break;

						}

						}
						break;

					}

					}

				}

			}

		}
		}

	}

}
