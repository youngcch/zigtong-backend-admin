package capstone.zigtong.adminserver.domain.admin.dto;

import capstone.zigtong.adminserver.domain.admin.Admin;
import capstone.zigtong.adminserver.domain.admin.Role;
import capstone.zigtong.adminserver.domain.post.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Data
@AllArgsConstructor
public class AdminDto {

    private String id;
    private String accountId;
    private String password;
    private String name;
    private String companyName;
    private String businessName;
    private String phoneNumber;
    private String businessNumber;

    private String category;

    private Role role;

    private List<Post> postList=new ArrayList<>();  //list<dto>로 바꿀것

    public AdminDto(String accountId, String password, String name, String companyName, String businessName, String phoneNumber, String businessNumber, String category, Role role) {
        this.accountId = accountId;
        this.password = password;
        this.name = name;
        this.companyName = companyName;
        this.businessName = businessName;
        this.phoneNumber = phoneNumber;
        this.businessNumber = businessNumber;
        this.category = category;
        this.role = role;
    }

    public Admin toEntity(String encryptedPassword){
        return new Admin(accountId, encryptedPassword, name, companyName, businessName, phoneNumber, businessNumber, category, role);
    }
}
