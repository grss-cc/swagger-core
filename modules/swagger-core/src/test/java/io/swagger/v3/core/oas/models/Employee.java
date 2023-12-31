package io.swagger.v3.core.oas.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@JsonRootName("employee")
@JsonTypeName("employee")
@JsonInclude(Include.NON_EMPTY)
@JsonTypeInfo(include = As.WRAPPER_OBJECT, use = Id.NAME)
@Schema(description = "Represents an Employee in the system", title = "employee")
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private Link<Department> dept;
    private Link<Employee> manager;
    private Set<Link<Employee>> subordinates;

    public Employee() {
        // TODO Auto-generated constructor stub
    }

    @XmlElement
    @JsonProperty
    @Schema(description = "Note, this is server generated.", title = "Read-only")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    @JsonProperty
    @Schema(required = true)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement
    @JsonProperty
    @Schema(required = true)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("department")
    @XmlElement(name = "department")
    @Schema(type = "Link", required = true, description = "The department this employee belongs to.")
    public Link<Department> getDept() {
        return dept;
    }

    public void setDept(Link<Department> dept) {
        this.dept = dept;
    }

    @JsonProperty("manager")
    @XmlElement(name = "manager")
    @Schema(type = "Link", required = true, description = "The employee this employee reports to.")
    public Link<Employee> getManager() {
        return manager;
    }

    public void setManager(Link<Employee> manager) {
        this.manager = manager;
    }

    @JsonProperty("team")
    @XmlElement(name = "team")
    @Schema(required = true, description = "List of employees that report to this employee.")
    public Set<Link<Employee>> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(Set<Link<Employee>> subordinates) {
        this.subordinates = subordinates;
    }
}