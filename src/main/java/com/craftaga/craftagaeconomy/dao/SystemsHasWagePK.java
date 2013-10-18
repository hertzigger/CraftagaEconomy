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

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Description
 * <p/>
 * Created: 17/09/13 - 21:57
 *
 * @author hertzigger
 */

public class SystemsHasWagePK implements Serializable {
    private Long systemsIdSystems;

    @Id
    @Column(name = "systems_id_systems")
    public Long getSystemsIdSystems() {
        return systemsIdSystems;
    }

    public void setSystemsIdSystems(Long systemsIdSystems) {
        this.systemsIdSystems = systemsIdSystems;
    }

    private Long wageIdWage;

    @Id
    @Column(name = "wage_id_wage")
    public Long getWageIdWage() {
        return wageIdWage;
    }

    public void setWageIdWage(Long wageIdWage) {
        this.wageIdWage = wageIdWage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemsHasWagePK that = (SystemsHasWagePK) o;

        if (systemsIdSystems != null ? !systemsIdSystems.equals(that.systemsIdSystems) : that.systemsIdSystems != null)
            return false;
        if (wageIdWage != null ? !wageIdWage.equals(that.wageIdWage) : that.wageIdWage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = systemsIdSystems != null ? systemsIdSystems.hashCode() : 0;
        result = 31 * result + (wageIdWage != null ? wageIdWage.hashCode() : 0);
        return result;
    }
}
