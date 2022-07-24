package cn.winebibber.prinicples.openclose;

import lombok.Data;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-24 15:43
 * @Description:
 */
@Data
public class CompanyEntry {
    private AbstractDepartment department;

    public void goWork(){
        this.department.goWork();
    }
}
