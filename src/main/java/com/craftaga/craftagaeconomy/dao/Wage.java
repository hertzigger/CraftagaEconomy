package com.craftaga.craftagaeconomy.dao;/**
 * CraftagaEconomy Plugin for bukkit
 * Copyright (C) 2013 Craftaga.com <hertzigger@craftaga.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

/**
 * Description
 * <p/>
 * Created: 17/09/13 - 21:57
 *
 * @author hertzigger
 */

@Entity
public class Wage {
    private Long idWage;

    @javax.persistence.Column(name = "id_wage")
    @Id
    public Long getIdWage() {
        return idWage;
    }

    public void setIdWage(Long idWage) {
        this.idWage = idWage;
    }

    private String name;

    @javax.persistence.Column(name = "name")
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String interval;

    @javax.persistence.Column(name = "interval")
    @Basic
    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    private String permission;

    @javax.persistence.Column(name = "permission")
    @Basic
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wage wage = (Wage) o;

        if (idWage != null ? !idWage.equals(wage.idWage) : wage.idWage != null) return false;
        if (interval != null ? !interval.equals(wage.interval) : wage.interval != null) return false;
        if (name != null ? !name.equals(wage.name) : wage.name != null) return false;
        if (permission != null ? !permission.equals(wage.permission) : wage.permission != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idWage != null ? idWage.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (interval != null ? interval.hashCode() : 0);
        result = 31 * result + (permission != null ? permission.hashCode() : 0);
        return result;
    }

    private Collection<SystemsHasWage> systemsHasWagesByIdWage;

    @OneToMany(mappedBy = "wageByWageIdWage")
    public Collection<SystemsHasWage> getSystemsHasWagesByIdWage() {
        return systemsHasWagesByIdWage;
    }

    public void setSystemsHasWagesByIdWage(Collection<SystemsHasWage> systemsHasWagesByIdWage) {
        this.systemsHasWagesByIdWage = systemsHasWagesByIdWage;
    }
}
