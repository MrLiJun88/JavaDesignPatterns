package com.combinationmode;

public class Client {
    public static void main(String[] args) {
        /**创建公司*/
        AbstractOrganiziation company = new Company("腾讯公司","软件公司");
        /**创建公司部门*/
        AbstractOrganiziation department = new Department("开发部","java技术部门");
        AbstractOrganiziation department2 = new Department("测试部","没日没夜的测试");
        /**创建部门中的员工*/
        AbstractOrganiziation position = new Position("程序员二狗","已秃头");
        AbstractOrganiziation position2 = new Position("测试员王五","手已残");
        AbstractOrganiziation position3 = new Position("程序员熊二","单身十年");

        company.add(department);
        company.add(department2);

        department.add(position);
        department.add(position3);
        department2.add(position2);

        company.show();
    }
}
