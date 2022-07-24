package cn.winebibber.prinicples.openclose;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-24 15:44
 * @Description:
 */
public class OpenCloseClient {
    public static void main(String[] args) {
        // 部门选择
        DepartmentA departmentA = new DepartmentA();
        DepartmentB departmentB = new DepartmentB();

        //开始工作
        CompanyEntry companyEntry = new CompanyEntry();
        companyEntry.setDepartment(departmentB);
        departmentA.goWork();
    }
}
