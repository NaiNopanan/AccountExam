// Generated with g9.

package com.nopanan.registrationservice.model.db;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="user_tb")
public class UserTb implements Serializable {

    /** Primary key. */
    protected static final String PK = "userId";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="user_id", unique=true, nullable=false, precision=10)
    private Integer userId;
    @Column(nullable=false, length=50)
    private String username;
    @Column(nullable=false, length=50)
    private String password;
    @Column(length=250)
    private String address;
    @Column(nullable=false, length=10)
    private String phone;
    @Column(nullable=false, precision=10)
    private Integer salary;
    @Column(length=50)
    private String refcode;

    /** Default constructor. */
    public UserTb() {
        super();
    }

    /**
     * Access method for userId.
     *
     * @return the current value of userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Setter method for userId.
     *
     * @param aUserId the new value for userId
     */
    public void setUserId(Integer aUserId) {
        userId = aUserId;
    }

    /**
     * Access method for username.
     *
     * @return the current value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter method for username.
     *
     * @param aUsername the new value for username
     */
    public void setUsername(String aUsername) {
        username = aUsername;
    }

    /**
     * Access method for password.
     *
     * @return the current value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for password.
     *
     * @param aPassword the new value for password
     */
    public void setPassword(String aPassword) {
        password = aPassword;
    }

    /**
     * Access method for address.
     *
     * @return the current value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter method for address.
     *
     * @param aAddress the new value for address
     */
    public void setAddress(String aAddress) {
        address = aAddress;
    }

    /**
     * Access method for phone.
     *
     * @return the current value of phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter method for phone.
     *
     * @param aPhone the new value for phone
     */
    public void setPhone(String aPhone) {
        phone = aPhone;
    }

    /**
     * Access method for salary.
     *
     * @return the current value of salary
     */
    public Integer getSalary() {
        return salary;
    }

    /**
     * Setter method for salary.
     *
     * @param aSalary the new value for salary
     */
    public void setSalary(Integer aSalary) {
        salary = aSalary;
    }

    /**
     * Access method for refcode.
     *
     * @return the current value of refcode
     */
    public String getRefcode() {
        return refcode;
    }

    /**
     * Setter method for refcode.
     *
     * @param aRefcode the new value for refcode
     */
    public void setRefcode(String aRefcode) {
        refcode = aRefcode;
    }

    /**
     * Compares the key for this instance with another UserTb.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UserTb and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UserTb)) {
            return false;
        }
        UserTb that = (UserTb) other;
        Object myUserId = this.getUserId();
        Object yourUserId = that.getUserId();
        if (myUserId==null ? yourUserId!=null : !myUserId.equals(yourUserId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UserTb.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UserTb)) return false;
        return this.equalKeys(other) && ((UserTb)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        if (getUserId() == null) {
            i = 0;
        } else {
            i = getUserId().hashCode();
        }
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[UserTb |");
        sb.append(" userId=").append(getUserId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("userId", getUserId());
        return ret;
    }

}
