package com.bjhj.heat.controller;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import com.bjhj.heat.model.Temp;

public class ExcelHandle {

	static Map<String,Integer>deviceExcelRow;
	static{
		deviceExcelRow=new HashMap<>();
        deviceExcelRow.put("7227dd06-f9ec-408c-b12a-be2cd2ea8861", 1);
        deviceExcelRow.put("ccfbd30c-45be-4341-8296-e895643e3e54", 2);
        deviceExcelRow.put("c0582731-d986-4f0b-8f09-91e151e5f092", 3);
        deviceExcelRow.put("ef79c41f-c00d-4950-b3e9-9f59f7d0059a", 4);
        deviceExcelRow.put("523d2a12-d2be-4596-a452-e997e182a85b", 5);
        deviceExcelRow.put("c858b214-4fc3-4510-aa35-ddc91b4ec18d", 6);
        deviceExcelRow.put("16abb493-a928-478f-9ae1-60b1a5b0f206", 7);
        deviceExcelRow.put("21f0329c-e275-48f9-8f89-8ff79b68b620", 8);
        deviceExcelRow.put("586ae346-09e7-4d4a-b26e-046f3d817f3f", 9);
        deviceExcelRow.put("247daac2-24f1-47ce-b0cc-0c1cc242e584", 10);
        deviceExcelRow.put("bb02565b-d4ec-482b-a4ce-6c90ad225933", 11);
        deviceExcelRow.put("756f076d-a832-4a74-9de4-0e5024c7f57c", 12);
        deviceExcelRow.put("fb7a8ebd-c6b5-4b71-ab90-b0c7eb3f5c54", 13);
        deviceExcelRow.put("f09537c4-35dc-4a4c-8b35-ac87f1c37fb5", 14);
        deviceExcelRow.put("947b4318-82f4-48a9-ad2a-a366f3a81cca", 15);
        deviceExcelRow.put("9a3d27d5-b8a3-4c3f-9f3c-6a833db21bb8", 16);
        deviceExcelRow.put("9d2720d3-9fa9-4ac8-b909-a52d0d24d758", 17);
        deviceExcelRow.put("05992a84-7a0b-4fd8-88a9-850c4a9713d5", 18);
        deviceExcelRow.put("5017a96a-8da8-4adc-a0b5-79f1103c5516", 19);
        deviceExcelRow.put("459029c7-9817-493e-b3ef-477d72055713", 20);
        deviceExcelRow.put("37b395ba-2dee-4425-a6cc-d7b60e638d37", 21);
        deviceExcelRow.put("ada39256-128e-4ae7-9066-3fc5b0ce8828", 22);
        deviceExcelRow.put("ad0a6ce3-5000-4d16-b729-d545b19b0f27", 23);
        deviceExcelRow.put("f1434cd7-9754-4b20-9d86-c9f51b12245c", 24);
        deviceExcelRow.put("7a835d9c-a032-4b54-9cd6-1ff3da352ea2", 25);
        deviceExcelRow.put("b999b30f-1bf9-46ef-9771-81344fb10c8d", 26);
        deviceExcelRow.put("75e4156e-cae7-4880-a73f-605c626ab57b", 27);
        deviceExcelRow.put("409cd789-5b6d-458c-b828-4809999edeae", 28);
        deviceExcelRow.put("ff93de78-04db-40c0-8eb6-21b9e1190a6e", 29);
        deviceExcelRow.put("c786c36f-214d-4d73-b255-fe8aea40ef5e", 30);
        deviceExcelRow.put("ed66f254-a63c-4a90-adc5-3bfc079b6bd9", 31);
        deviceExcelRow.put("023c88ad-91f2-4bf7-84e3-a5375663925f", 32);
        deviceExcelRow.put("662d39fe-c7a0-4f83-88f4-79d5612ca5cb", 33);
        deviceExcelRow.put("d0e3eec7-b7bb-4dee-bef5-0c7693c86e87", 34);
        deviceExcelRow.put("e7b9c564-f639-4189-85ee-a65ed615d278", 35);
        deviceExcelRow.put("fcf5449b-63df-4ccf-9204-d0ebb015e814", 36);
        deviceExcelRow.put("805d1313-c518-4abf-b0bb-95710a72e9a4", 37);
        deviceExcelRow.put("1735cacf-4c03-4436-a3de-1134eecc3f91", 38);
        deviceExcelRow.put("b95a0a59-d54e-4505-a81c-e16daae8cf9d", 39);
        deviceExcelRow.put("dbcfa670-6166-46f6-83db-291c880e16b5", 40);
        deviceExcelRow.put("e719b41f-b75e-4993-8d42-1351416b7705", 41);
        deviceExcelRow.put("ee8e8dd8-b4f6-4c20-bffd-aba39ee46d46", 42);
        deviceExcelRow.put("74ec1492-5cc3-409a-94f8-c482277499db", 43);
        deviceExcelRow.put("80697fc6-99c5-4b36-a2cc-1da5df8a5822", 44);
        deviceExcelRow.put("b58fa7e0-ac2a-4d2c-bd25-e55bec5e0fb1", 45);
        deviceExcelRow.put("a46878a8-52d5-45d3-92cc-aba457cd2794", 46);
        deviceExcelRow.put("e7c58cf9-f22b-4398-96bf-15c946bdae2a", 47);
        deviceExcelRow.put("101425db-53d4-41e0-a620-ea96128f9bb7", 48);
        deviceExcelRow.put("802d635a-833b-4d40-8212-1b3723a7f190", 49);
        deviceExcelRow.put("834d4f4f-2c1d-4453-81b7-71581711a24d", 50);
        deviceExcelRow.put("90c5eba2-bdc5-45df-8e7d-739b28df4693", 51);
        deviceExcelRow.put("5ad9015f-046d-4377-b530-9e9a5bf600cd", 52);
        deviceExcelRow.put("d61b2c5b-eeed-48c2-a909-d8ec9f0673b1", 53);
        deviceExcelRow.put("7e226382-344a-4a9b-8824-9ed27ba15688", 54);
        deviceExcelRow.put("a9f2e676-8022-446c-9e41-cad2bbb81e62", 55);
        deviceExcelRow.put("620741ba-163b-406d-a1ec-c2c1dbbe6612", 56);
        deviceExcelRow.put("1fcb5ac5-ba3f-4a5c-8640-ccd8ea9efc47", 57);
        deviceExcelRow.put("277f99ce-f2bd-40a0-b447-97e163590029", 58);
        deviceExcelRow.put("196c23a9-bb44-4cd7-bc01-023c20a70e0c", 59);
        deviceExcelRow.put("142dc60a-f99e-4cd2-a57f-797cfc5fc691", 60);
        deviceExcelRow.put("fc660c3f-cab2-4538-8a70-56c496e5cf2b", 61);
        deviceExcelRow.put("113c082e-276e-4102-87e6-bcf5d107fe84", 62);
        deviceExcelRow.put("8abe467e-93e4-4ecc-8649-040a7d6770d0", 63);
        deviceExcelRow.put("cd73d285-58f9-4919-9484-856105a20116", 64);
        deviceExcelRow.put("2a52f8dc-12d0-44a3-8c8e-aacae1729091", 65);
        deviceExcelRow.put("e163685f-8d68-4d35-a919-6939fad2d876", 66);
        deviceExcelRow.put("f87e02d0-05b6-45d7-800a-ea45c63949aa", 67);
        deviceExcelRow.put("d27cebe5-ae87-472e-ba06-0cc4d288c9b2", 68);
        deviceExcelRow.put("f83502a9-0583-480c-9888-a9e67edc0df4", 69);
        deviceExcelRow.put("72fcef9d-ae14-4dfc-a592-5316cb721d49", 70);
        deviceExcelRow.put("00cf078a-45a2-4a58-87aa-1fcc561a568e", 71);
        deviceExcelRow.put("981cc877-3461-4adf-b5ad-2ebf7c50e0ff", 72);
        deviceExcelRow.put("9b89b746-cbe0-4574-9d04-387d6904942e", 73);
        deviceExcelRow.put("1abecb64-0272-4988-9b59-c97346b5598c", 74);
        deviceExcelRow.put("637ad9fc-1b6a-4761-8257-762ef35eb451", 75);
        deviceExcelRow.put("87373647-e8db-4dd4-ad93-cb2084d9d25f", 76);
        deviceExcelRow.put("36c2a9aa-7b82-4eb9-8d14-abed0ec317c0", 77);
        deviceExcelRow.put("5bd92f42-ece4-4ae4-b766-b113e1f0bb8c", 78);
        deviceExcelRow.put("f4e09877-3e30-483b-b5f3-73eec698fd75", 79);
        deviceExcelRow.put("fb368c58-95f5-4b31-a6aa-e45b493eed3a", 80);
        deviceExcelRow.put("b91aaef1-4ef3-4c71-8a42-7b9e4ee6323a", 81);
        deviceExcelRow.put("faf1d12a-18aa-45f0-a664-54b0960c7688", 82);
        deviceExcelRow.put("9dd91a38-5494-42fa-892d-d3e7a520eea5", 83);
        deviceExcelRow.put("c54b7234-b31c-46f4-af3a-5401c9e557c0", 84);
        deviceExcelRow.put("4f2db229-919b-440b-a24e-7b509d4d515f", 85);
        deviceExcelRow.put("a60ab39f-e99f-49b6-a1db-7d5ebf35aa1d", 86);
        deviceExcelRow.put("1ed3d84d-83a3-4a1a-a15c-1137be4acad8", 87);
        deviceExcelRow.put("0cebf3f7-64db-4398-9255-b90333a50f6c", 88);
        deviceExcelRow.put("211bbb6e-3383-42fd-b159-bfdfbdd268bd", 89);
        deviceExcelRow.put("7de7c5a2-6719-4df6-a332-c576216b7a6e", 90);
        deviceExcelRow.put("66cfc7fc-9cd5-4774-bb9f-4fc8c5ee6bee", 91);
        deviceExcelRow.put("68934b29-71a3-41f3-9027-df720b12f88c", 92);
        deviceExcelRow.put("8ca8d71e-ce39-495a-82ac-c76869f8f9b2", 93);
        deviceExcelRow.put("a5f0f920-3f53-41cd-9ec4-cc20017a3d14", 94);
        deviceExcelRow.put("480e4b31-233a-44bb-9d34-8e4504616527", 95);
        deviceExcelRow.put("67d2532b-0802-4096-afd6-8a7841ac2ff3", 96);
        deviceExcelRow.put("ccd427e1-c2a7-4e96-9e81-da08e645ce6b", 97);
        deviceExcelRow.put("f38fbe3f-ff83-49ed-8a52-c24b365dd5e1", 98);
        deviceExcelRow.put("1345053d-89d8-418c-a1bf-8e4ddeb7dafd", 99);
        deviceExcelRow.put("ed24a94f-ece4-4d22-81cc-164e86f57177", 100);
        deviceExcelRow.put("e85a25e1-94a0-44e9-a4ef-97bd2d3e4870", 101);
        deviceExcelRow.put("890764ca-b8be-48be-8e0c-c1099ebb8041", 102);
        deviceExcelRow.put("64149e41-f630-4045-bb3a-012444b1e702", 103);
        deviceExcelRow.put("213329c3-1cfa-4f41-b569-1ca3711262dd", 104);
        deviceExcelRow.put("61efbf4d-34c0-47f2-b76d-ba7b8432bf53", 105);
        deviceExcelRow.put("7a1461c2-1106-4cdd-93c9-51e41020daae", 106);
        deviceExcelRow.put("26fe1248-0bb4-4239-a2fa-a2e7b8811111", 107);
        deviceExcelRow.put("533a4e96-c43c-4e93-b677-e785806a2ed3", 108);
        deviceExcelRow.put("3fb00438-3305-424f-b269-76feeccf25b7", 109);
        deviceExcelRow.put("99d9a7ff-a14f-4842-a6a3-792ff6999088", 110);
        deviceExcelRow.put("01020b1f-e1c6-4999-ac0e-36e4ae318df1", 111);
        deviceExcelRow.put("f6d8f6d4-c781-49a7-9d2b-d3a454ca08c8", 112);
        deviceExcelRow.put("2c081cbd-03a5-4a4b-b2ed-5be5d28cd27b", 113);
        deviceExcelRow.put("a5cff073-e0f3-4c54-a928-faaf1c23fc82", 114);
        deviceExcelRow.put("a30d17ec-9f0d-4bcf-9c41-1c48060b8b37", 115);
        deviceExcelRow.put("e5c6ed21-ed0a-438b-938b-691c33256636", 116);
        deviceExcelRow.put("d08e293d-4196-4931-a3c8-a238f5b18c35", 117);
        deviceExcelRow.put("6b9648b8-a72b-4d21-b88b-432724823ae6", 118);
        deviceExcelRow.put("ddc877b6-2091-49f9-8888-8c21fbcb380e", 119);
        deviceExcelRow.put("91c44e70-5759-4d75-8b97-1c7be8eadb3d", 120);
        deviceExcelRow.put("8e7ee578-be60-4db3-ac04-75cf54c29d6c", 121);
        deviceExcelRow.put("5372e67c-8fbd-4c8f-8d8b-45381e219c94", 122);
        deviceExcelRow.put("4436da47-bd46-4b8b-8148-33c80b094b1a", 123);
        deviceExcelRow.put("9d519d71-ee81-4452-a62f-ab69e1c98250", 124);
        deviceExcelRow.put("b6422fd4-1c90-416e-a9cc-38205052b428", 125);
        deviceExcelRow.put("874596d3-cbcf-4281-865a-cc73dd757eaf", 126);
        deviceExcelRow.put("b1729c74-a051-4238-87ef-813dbea6d296", 127);
        deviceExcelRow.put("d52ee2a8-fc90-41cb-a2b5-f28c40a49d7c", 128);
        deviceExcelRow.put("d4ddbfe1-88a7-4bad-90d6-e91bf9aaebef", 129);
        deviceExcelRow.put("4c5585a9-d96e-4951-964c-c645198e708d", 130);
        deviceExcelRow.put("03ea10e1-d1fd-4680-9b88-87121c9c25eb", 131);
        deviceExcelRow.put("72b8b4f5-f952-496a-a524-2364136b7ef2", 132);
        deviceExcelRow.put("61057d48-364d-428a-aca7-5584243bc49d", 133);
        deviceExcelRow.put("f13351e8-dad5-4055-9372-4c533eb04dcd", 134);
        deviceExcelRow.put("b8ae30d0-c328-431b-9931-0d1f2663a2f5", 135);
        deviceExcelRow.put("09b88f79-0ddc-4e54-a8f5-d74f8a62e20e", 136);
        deviceExcelRow.put("67964798-1cec-4d39-8e11-f1a5e317e9d5", 137);
        deviceExcelRow.put("9a394a18-1703-47bf-9ec6-fa6883d5a728", 138);
        deviceExcelRow.put("fd8b8f60-45da-4c6b-9149-7d55807d30a2", 139);
        deviceExcelRow.put("f7d29051-4c59-4c68-a1c8-24704357804e", 140);
        deviceExcelRow.put("9d12920c-4c2f-4fa5-8ded-44b07b6c3e2e", 141);
        deviceExcelRow.put("b2b79112-3c53-4de0-8189-35901d03bb2e", 142);
        deviceExcelRow.put("7c05a11a-5a3e-44e3-9373-90dba336483a", 143);
        deviceExcelRow.put("b8e5e4cb-a732-41ae-9e3f-a515045e386e", 144);
        deviceExcelRow.put("230e7707-5c43-40cb-bef2-00b3539db8fc", 145);
        deviceExcelRow.put("0ab2d60e-d03f-41ac-a790-09d9b4607247", 146);
        deviceExcelRow.put("bc41ba68-0e89-48f3-b1c8-0e6ef3faf375", 147);
        deviceExcelRow.put("3f31ef68-7684-42a1-add0-1e857e2d325f", 148);
        deviceExcelRow.put("23756f68-a213-402c-ad6c-c11a69dda8c0", 149);
        deviceExcelRow.put("25bff9d6-dc5d-4dd4-86bd-a9d2ea72de4a", 150);
        deviceExcelRow.put("564e9a4a-8f7f-4440-ada4-b105e0d819df", 151);
        deviceExcelRow.put("a89b759f-64e1-4a7c-9bdc-21d2c27dfe2e", 152);
        deviceExcelRow.put("101ce700-d497-49aa-a449-5240e82d0c47", 153);
        deviceExcelRow.put("a9cac36d-450c-4b8a-bfd7-c7bfe2cdb79b", 154);
        deviceExcelRow.put("5d9f8e66-e5ec-4394-be3e-b4e63b0bb359", 155);
        deviceExcelRow.put("b3bc2725-2b41-4e62-9379-7161d962aeb1", 156);
        deviceExcelRow.put("44b83418-2bd4-415f-9d34-5ef58eb91d38", 157);
        deviceExcelRow.put("7a8436f4-4265-4749-a229-faf9ddabd412", 158);
        deviceExcelRow.put("a546926d-929d-4a5e-8a83-85d59501fa5a", 159);
        deviceExcelRow.put("d8d14f04-febe-40e6-84a9-722f6b735aba", 160);
        deviceExcelRow.put("64011d28-5759-4664-916b-f7c2697bf8a1", 161);
        deviceExcelRow.put("f519d835-47b1-4077-889b-834b84ff7040", 162);
        deviceExcelRow.put("84e9d712-121b-4426-b3d8-15918fcaf9cb", 163);
        deviceExcelRow.put("835c529d-6c98-4fa5-8a01-73dcd49db610", 164);
        deviceExcelRow.put("7216ad4b-8aa9-4176-83b1-dba89709d417", 165);
        deviceExcelRow.put("76edb530-63db-4b9b-8a54-1b4b8fd33f37", 166);
        deviceExcelRow.put("731ffbb6-6e2a-4fac-a6b5-72ef1e16120d", 167);
        deviceExcelRow.put("ef7f3190-76e9-41be-813b-f83e2ca3abc1", 168);
        deviceExcelRow.put("34784877-71ff-46d8-97af-99a4b566f367", 169);
        deviceExcelRow.put("4f89334e-0851-4029-b711-482a76cc4131", 170);
        deviceExcelRow.put("59ce6da6-02de-42d7-99c7-871e898d9bf9", 171);
        deviceExcelRow.put("8600dbe2-fcec-42e3-85c4-59d2ffde599c", 172);
        deviceExcelRow.put("e2a5e349-a004-4021-a35b-44162c6fde24", 173);
        deviceExcelRow.put("463a6004-7815-42f8-bbdc-00a181433386", 174);
        deviceExcelRow.put("2efcaf09-457e-45f5-8be1-19517996759c", 175);
        deviceExcelRow.put("a79b2055-c4bb-40d0-b0f7-8b12d6139dcd", 176);
        deviceExcelRow.put("82710de1-cc9b-49e6-a8cd-99f003527471", 177);
        deviceExcelRow.put("7da60aa6-51be-4c25-92fa-be334e388902", 178);
        deviceExcelRow.put("a67ca1ce-74c3-4505-b149-2eb96a06a195", 179);
        deviceExcelRow.put("2c9a60fe-11b7-4859-a222-5673c527254c", 180);
        deviceExcelRow.put("8899b9a0-3147-49d1-99c2-e175728c0b36", 181);
        deviceExcelRow.put("203b86c3-a3ca-4fe0-bbd9-1ef61862af8b", 182);
        deviceExcelRow.put("100c92d2-8605-441d-9014-36a49366c92e", 183);
        deviceExcelRow.put("105d1714-c257-4294-b071-9fb5c7a64cd5", 184);
        deviceExcelRow.put("a8b4b27c-d003-4ca5-af83-df1024b6778c", 185);
        deviceExcelRow.put("61024b55-4a72-4c64-9871-b290a82437c1", 186);
        deviceExcelRow.put("193ea959-d104-4ee3-83ce-80c9d9350880", 187);
        deviceExcelRow.put("abeb6a6e-ad76-4905-b165-dc7eb74b9188", 188);
        deviceExcelRow.put("b2fe87c4-b658-4b93-baf4-fa01fd24a440", 189);
        deviceExcelRow.put("9473fae5-aa5d-49c9-82f3-08d9edb35b60", 190);
        deviceExcelRow.put("b9ef7084-a9a3-497c-8a50-b4597f3def2b", 191);
        deviceExcelRow.put("48cb45f0-be97-499f-b829-0e35297cb540", 192);
        deviceExcelRow.put("bbc834da-f6b6-4cb0-a753-4f9f5eb9b879", 193);
        deviceExcelRow.put("e6456767-9e35-43e5-9dc0-983dc8d15daa", 194);
        deviceExcelRow.put("1847773c-808b-47ae-9431-989921e5ae2c", 195);
        deviceExcelRow.put("7cea95af-6ee5-4a04-a891-7ee0dfbcd079", 196);
        deviceExcelRow.put("bb05a063-d8be-44a0-9c26-86f3ee8ba43b", 197);
        deviceExcelRow.put("21607155-8276-418c-ad61-0c65bea824bd", 198);
        deviceExcelRow.put("f5c3a0e2-6369-4278-84ee-d575e00f3181", 199);
        deviceExcelRow.put("caf50bea-026c-4bb2-9d18-41a4a2621df2", 200);
        deviceExcelRow.put("35a9dd7b-a020-46f0-af6a-c18d777e5eb5", 201);
        deviceExcelRow.put("7be05c59-006e-4866-9624-f1c5cd90dfaf", 202);
        deviceExcelRow.put("62850e32-4a92-4562-8c5e-3e63920fc0c3", 203);
        deviceExcelRow.put("43588302-a924-4cd0-99ca-f3f8eee37f81", 204);
        deviceExcelRow.put("68c73c4e-bdf1-47ea-8724-e236393c780b", 205);
        deviceExcelRow.put("3641b005-bdbf-4f53-9846-c9de2e685cd6", 206);
        deviceExcelRow.put("7708cb58-da0b-42f1-b168-8b4bc8e6e1c3", 207);
        deviceExcelRow.put("4c617ddb-d844-4a6a-a378-026c64f5c017", 208);
        deviceExcelRow.put("1ea222e6-ea74-4110-8132-2b7b0d5e51cc", 209);
        deviceExcelRow.put("8a7ed1d4-a63f-4e43-bb87-ae833ac8c27c", 210);
        deviceExcelRow.put("3c42b6b1-3524-4824-b7b1-7861606eed6c", 211);
        deviceExcelRow.put("4b3519d2-41db-478e-8013-05f3c43b4ffb", 212);
        deviceExcelRow.put("7215dffa-6b62-421e-b60f-6c155fa9f334", 213);
        deviceExcelRow.put("cefe9ba2-73f9-4765-b00e-75d4d6e1ca06", 214);
        deviceExcelRow.put("e280e688-c117-482a-844f-a672f325c5a9", 215);
        deviceExcelRow.put("d59a58b8-5892-4a82-b38c-3e4c4cdd39a9", 216);
        deviceExcelRow.put("af7cfc64-aa26-4dd7-9025-4a2a02947ab4", 217);
        deviceExcelRow.put("095cf93f-73df-4d49-a47d-fa89c41e6966", 218);
        deviceExcelRow.put("a574391d-f466-4ca1-80b9-e2f9a159ce24", 219);
        deviceExcelRow.put("39da93f5-7e5d-4b56-abb0-085812765540", 220);
        deviceExcelRow.put("f64be7ed-e608-4238-8455-dec620518afd", 221);
        deviceExcelRow.put("b81b62b5-cbe8-4566-95cf-91b1ea503b95", 222);
        deviceExcelRow.put("16692e82-26f4-4adb-8816-061b1633023f", 223);
        deviceExcelRow.put("ea466ca0-0306-4634-8d9e-600c02470401", 224);
        deviceExcelRow.put("2ac169c7-a95e-4ead-b206-c7baf0f850ef", 225);
        deviceExcelRow.put("7c3c5ffa-daac-4bf1-9338-0b366eaf7e43", 226);
        deviceExcelRow.put("208b9e29-df44-48a3-b22e-6bc86a6860b5", 227);
        deviceExcelRow.put("1b7dd346-640b-4643-aded-724cea2bba46", 228);
        deviceExcelRow.put("8f499d73-e6b5-4c86-957f-c5917d28efba", 229);
        deviceExcelRow.put("e580f333-5fe0-45ba-9856-aee36feaa459", 230);
        deviceExcelRow.put("0960091a-fcec-4d5a-a53c-33b98774ccfb", 231);
        deviceExcelRow.put("e92cbace-9720-4360-afab-1b5efbe352e7", 232);
        deviceExcelRow.put("d3ef2e0d-3f73-4686-89a5-f0224709da74", 233);
        deviceExcelRow.put("1f8fed5e-8539-4288-8607-e8e11a304677", 234);
        deviceExcelRow.put("bff4e11d-667f-42ad-b4e4-d7a791036d28", 235);
        deviceExcelRow.put("1f7b376b-d223-4f91-a6a4-e84a8e19ba72", 236);
        deviceExcelRow.put("fb6424b9-bd3f-4f18-9a99-d43c55247361", 237);
        deviceExcelRow.put("8ce4d8a2-d80b-4b67-a1f0-1c157501b7bf", 238);
        deviceExcelRow.put("bc69e672-4054-4c03-a2b2-bb2cb15a50e1", 239);
        deviceExcelRow.put("7d09f5d4-0e57-40e0-a273-2a51a914f32b", 240);
        deviceExcelRow.put("b1063757-79ee-40d8-b0dc-245c57ecbafd", 241);
        deviceExcelRow.put("aca5a5c4-5c2c-4695-bcbe-b82c5bdb5012", 242);
        deviceExcelRow.put("3421c8f2-05ec-4a55-bd8c-bce8fcbf872c", 243);
        deviceExcelRow.put("2322c553-3ef6-47cb-87fa-337f53c87f7e", 244);
        deviceExcelRow.put("810884a9-a1de-4b5e-bef5-bebdb2b09cbd", 245);
        deviceExcelRow.put("eb912bea-09c6-4428-9a4e-71390e24594d", 246);
        deviceExcelRow.put("d0b539dc-0d08-465a-87da-edfb0a53ea82", 247);
        deviceExcelRow.put("c90c45ac-f1d9-46ea-976b-dc66a0427ac7", 248);
        deviceExcelRow.put("2a43aa4c-efc7-4294-bd53-cbf21a565054", 249);
        deviceExcelRow.put("21711d15-bfdd-4d07-b734-d4f62108190e", 250);
        deviceExcelRow.put("e3b6a73a-cdd7-42f1-ae36-38c88f3e3898", 251);
        deviceExcelRow.put("a15960c6-e38a-4733-a3d7-fa7bc58153e2", 252);
        deviceExcelRow.put("3281c19b-cac4-4cc1-9d63-17e841504985", 253);
        deviceExcelRow.put("11350ce2-c503-495c-b942-b1b15a30fb77", 254);
        deviceExcelRow.put("a28e223e-83c1-4255-9f8b-90e0f56aebf9", 255);
        deviceExcelRow.put("dcacf3e2-783e-4074-8edc-61048bffe629", 256);
        deviceExcelRow.put("34673cff-d12e-475b-9d9a-8ee453e2fc42", 257);
        deviceExcelRow.put("c0997c3f-1500-40f8-bde2-00c9403e5057", 258);
        deviceExcelRow.put("8a33f2c6-4630-4120-9ae9-7c7ca1152db1", 259);
        deviceExcelRow.put("a4ce91b9-3f58-4b42-bb3a-6f68f890462c", 260);
        deviceExcelRow.put("9098e196-6c7e-4c5c-91d4-30948abc89be", 261);
        deviceExcelRow.put("863f06df-c21f-4f04-b593-f83befd114ca", 262);
        deviceExcelRow.put("7f47698e-cfef-4e3a-ac5e-2ef6f0e7dc65", 263);
        deviceExcelRow.put("c820e835-5e38-44e6-ba94-99399fb68292", 264);
        deviceExcelRow.put("c4d89242-4afc-4c5c-ae07-996b56026e26", 265);
        deviceExcelRow.put("707f62c7-2742-4b23-9045-071e47a8fc34", 266);
        deviceExcelRow.put("3e4a1b69-0dcb-40a1-8f39-b4dbb61bf036", 267);
        deviceExcelRow.put("57dc3ac1-85c2-4a7a-9c67-b6d8e2c37472", 268);
        deviceExcelRow.put("b1c94101-89b4-4ba7-bb9b-57fc3c716f44", 269);
        deviceExcelRow.put("f97035fe-6479-49a3-b05c-7fa64edc6c38", 270);
        deviceExcelRow.put("23f9eced-9095-4379-8e01-5cdb57a85c2f", 271);
        deviceExcelRow.put("7b290468-91de-4384-a401-1efa57b731a1", 272);
        deviceExcelRow.put("f2fc366b-0198-42c9-88c3-75873b582b67", 273);
        deviceExcelRow.put("74dc9095-07d7-414e-b0ef-afa378dd83ce", 274);
        deviceExcelRow.put("2fde846a-d9d7-4ae5-a337-576951fc01fb", 275);
        deviceExcelRow.put("2135b135-99a9-4c91-8f64-88fe85de6e61", 276);
        deviceExcelRow.put("b840b18e-2170-46d1-bb84-55d6f1562b57", 277);
        deviceExcelRow.put("1bb1a4ad-1ee1-46ac-8983-86b286dd723f", 278);
        deviceExcelRow.put("14047f69-3de2-43ae-b474-443585c20583", 279);
        deviceExcelRow.put("5f57c2de-e4a5-4cf2-9fd0-2243c1643019", 280);
        deviceExcelRow.put("685acf4b-a6a3-4562-a809-0ea3ac2c838a", 281);
        deviceExcelRow.put("676612c4-4433-4ba9-ab9b-a6bafaf6829a", 282);
        deviceExcelRow.put("bf717d67-21d2-4558-a854-c8cec181e93c", 283);
        deviceExcelRow.put("d194efad-9c4d-4070-acef-0ff064b8e754", 284);
        deviceExcelRow.put("fdbc8a6b-8b10-4071-97a2-2d0d8c8718fc", 285);
        deviceExcelRow.put("eb36704c-9984-472d-aecf-d72e415448d8", 286);
        deviceExcelRow.put("0b29d280-d488-480d-8e60-681d23e9ca08", 287);
        deviceExcelRow.put("2e0ecfaa-4901-4a0f-91f1-e577bea850dd", 288);
        deviceExcelRow.put("f82a0170-3c34-48ee-99d0-aab4fa445081", 289);
        deviceExcelRow.put("19393f02-ec29-4b00-b294-3477cf5b17cc", 290);
        deviceExcelRow.put("2dc8d6ec-6376-4eed-940c-5e563fb1cb1e", 291);
        deviceExcelRow.put("89f79011-0c0c-4e14-8ac3-13d479de9169", 292);
        deviceExcelRow.put("e17a2e5c-7e71-415c-ae8e-84a38598e2a4", 293);
        deviceExcelRow.put("fec762c4-b503-482a-9589-5cab0224c2ba", 294);
        deviceExcelRow.put("db33544e-08ea-41a9-a3b6-7a99efafdeec", 295);
        deviceExcelRow.put("7ebd2351-3c58-49b6-8ddb-d5c5347b93e3", 296);
        deviceExcelRow.put("e6160c3c-99be-450e-9f59-7748f5cdba00", 297);
        deviceExcelRow.put("591c13cc-9b04-44b9-93a6-e423b466a241", 298);
        deviceExcelRow.put("aadfe3c2-93c2-430f-a7ca-34f2400297a2", 299);
        deviceExcelRow.put("04021e82-13d6-4dc9-938e-d47e247143e9", 300);
        deviceExcelRow.put("b704060e-faff-4770-9bd7-95789f7e9bd1", 301);
        deviceExcelRow.put("a37d5e86-ec14-43b2-ac43-fe1e64b98777", 302);
        deviceExcelRow.put("c9203e43-b59e-41d8-b6c3-d5fe2751cf30", 303);
        deviceExcelRow.put("40c743d3-0fed-40a0-b221-339e3b0dcdda", 304);
        deviceExcelRow.put("ccd8a8bc-08ae-400d-b22a-4cd7a06d04d8", 305);
        deviceExcelRow.put("ff9f4e0e-8d0c-4fc0-a961-820451193b0c", 306);
        deviceExcelRow.put("c776c9ae-0d35-4efb-8b8f-04bbabf71bb4", 307);
        deviceExcelRow.put("b442bc74-b727-4fc9-9fc6-f6c2c238e570", 308);
        deviceExcelRow.put("06b58a31-6e56-4cf5-9748-15d23b6b4270", 309);
        deviceExcelRow.put("6818d570-7bb1-4613-8dfd-b50babd28e7e", 310);
        deviceExcelRow.put("d68fe8c2-8f29-433f-a149-b90aaf9dd4e2", 311);
        deviceExcelRow.put("a7871ac4-c029-4f85-85ff-136a22697c01", 312);
        deviceExcelRow.put("05f2d466-2970-415f-a179-1bb7c869d696", 313);
        deviceExcelRow.put("100563b7-3dc1-468b-a7a4-2bfc169433e7", 314);
        deviceExcelRow.put("65230a33-d1c5-45e2-918d-afdbfa58142e", 315);
        deviceExcelRow.put("507735eb-1ff7-41f7-84fe-caada9f16359", 316);
        deviceExcelRow.put("dc32d97d-be6b-4da8-bf46-45cc806ce41b", 317);
        deviceExcelRow.put("bce824ac-bb53-4273-8a46-93f96fc1f1a7", 318);
        deviceExcelRow.put("f67b0c15-9779-46fa-9860-8dd4985cd8fc", 319);
        deviceExcelRow.put("fa5656f1-d5e9-4687-b747-74e724fc8624", 320);
        deviceExcelRow.put("204041b1-3e7e-4828-865d-30220cb2aa68", 321);
        deviceExcelRow.put("00fc316e-c30b-4c64-8e29-914e5ca8f316", 322);
        deviceExcelRow.put("e1a332a0-7df3-4c73-93df-43cf9623aa4d", 323);
        deviceExcelRow.put("7f698a24-7c3a-4d1e-a735-e890cfcd50bd", 324);
        deviceExcelRow.put("e9cc5824-71a8-458c-840c-b241cb63ee5e", 325);
        deviceExcelRow.put("cee50ec8-7c8c-46ed-bd31-0cc0edde807e", 326);
        deviceExcelRow.put("7c352775-c3eb-4df4-b8bd-3e830ee87ff1", 327);
        deviceExcelRow.put("fa1956d2-2ad1-483b-8139-decb35a3a51e", 328);
        deviceExcelRow.put("1c053287-9be8-445f-83d3-e6bd40a59194", 329);
        deviceExcelRow.put("ac3948ea-7068-43eb-8673-8f2d8e76dcd4", 330);
        deviceExcelRow.put("33a16f61-1d45-414f-9936-d83436adc18d", 331);
        deviceExcelRow.put("f3db30f4-5d87-4429-b10b-fc6df9a30963", 332);
        deviceExcelRow.put("5803135a-14f8-45c0-97e0-1abc2d744815", 333);
        deviceExcelRow.put("218b4b88-6005-4e4a-814e-39cb2bee70fd", 334);
        deviceExcelRow.put("11c27c80-7885-4aca-b870-fd91879e7282", 335);
        deviceExcelRow.put("c432df99-a426-46fd-9316-665d2ba1b663", 336);
        deviceExcelRow.put("9250e298-dd72-41af-ad7f-b964a3b3e04c", 337);
        deviceExcelRow.put("ebe3d677-ac48-45ac-a29b-cbb1f9b493ed", 338);
        deviceExcelRow.put("6b82249f-5bcf-4616-89f7-786ca61c5cd3", 339);
        deviceExcelRow.put("9a3c1efb-934c-4c05-8ad1-b52c37208833", 340);
        deviceExcelRow.put("09a3d693-f83c-4863-ae58-6da2353735a8", 341);
        deviceExcelRow.put("0f0f4d19-88c4-4d6a-99ee-aa6709e54488", 342);
        deviceExcelRow.put("440b544f-aa50-4b76-81e4-48a4b37b088c", 343);
        deviceExcelRow.put("d76fcb55-32c5-4b80-81c3-2055236b5cb5", 344);
        deviceExcelRow.put("61e9918a-c6f6-45d0-b864-6364a810c3a4", 345);
        deviceExcelRow.put("6de494ee-44eb-4ab9-a9e7-d1746e5a8ed4", 346);
        deviceExcelRow.put("041eafee-3194-4da6-94f0-e9b843145065", 347);
	}


//    final static String excelPath = "F:\\Projects\\heat\\Environment.xlsx";
//    final static String excelPath = "/home/liuzy2020/Project/vscode/java/IOT/heat/Environment.xlsx";
    final static String excelPath = "C:\\Users\\Administrator\\Environment\\Environment.xlsx";
    final static String sheetName = "environment";

    public static void writeToExcel(Temp temp) throws IOException {
        InputStream inputStream = new FileInputStream(excelPath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        XSSFRow row;
        if(deviceExcelRow.get(temp.getDeviceId()) == null)
        {
            deviceExcelRow.put(temp.getDeviceId(),deviceExcelRow.size()+1);
            row = sheet.createRow(deviceExcelRow.size());
            for(int i=0;i<12;i++)
            {
                row.createCell(i);
            }
            row.getCell(0).setCellValue(temp.getDeviceId());
        }
        row = sheet.getRow(deviceExcelRow.get(temp.getDeviceId()));

        //ServiceID
        row.getCell(1).setCellValue("Transimission");

        //EventTime
        row.getCell(2).setCellValue(temp.getEventTime());

        //RoomTemperture
        row.getCell(3).setCellValue(temp.getRoomTemperature()/10.0);

        //RoomHumidity
        row.getCell(4).setCellValue(temp.getRoomHumidity());

        //InnerTempAlarm
        row.getCell(5).setCellValue(temp.getInnerTempAlarm());

        //ExtTempAlarm
        row.getCell(6).setCellValue(temp.getExtTempAlarm());

        //HumitureAlarm
        row.getCell(7).setCellValue(temp.getHumitureAlarm());

        //IMEI
        row.getCell(8).setCellValue(temp.getImei());

        //Battery
        row.getCell(9).setCellValue(temp.getBattery());

        //ICCID
        row.getCell(10).setCellValue(temp.getIccId());

        //CellID
        row.getCell(11).setCellValue(temp.getCellId());

        FileOutputStream fileOutputStream = new FileOutputStream(excelPath);
        workbook.write(fileOutputStream);

        workbook.close();
        inputStream.close();

        fileOutputStream.flush();
        fileOutputStream.close();


    }

    public static void main(String[] args) throws IOException {
        Temp temp = new Temp();
        temp.setDeviceId("7227dd06-f9ec-408c-b12a-be2cd2ea8861");
        temp.setBattery(400);
        temp.setCellId("87652495");
        temp.setEventTime("20200894");
        temp.setExtTempAlarm(0);
        temp.setHumitureAlarm(0);
        temp.setIccId("798768");
        temp.setImei("182738126381");
        temp.setInnerTempAlarm(0);
        temp.setRoomHumidity(70);
        temp.setRoomTemperature(294);
        temp.setServiceEnvironment("transimission");
        temp.setServiceDevice("data");

        try{
            System.out.println(temp);
            writeToExcel(temp);
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
