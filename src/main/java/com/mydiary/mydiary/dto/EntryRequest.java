/*
> Group 7:
    - 20248/2022    SERGE MUNEZA
    - 20486/2022    SAMUEL MURENGEZI
    - 20844/2022    GISELE MUKANTWARI MUNEZERO
> Class: EntryRequest
> Description: A DTO for capturing entry creation and update data.
 */

package com.mydiary.mydiary.dto;

import lombok.Data;

@Data
public class EntryRequest {
    private String title;
    private String description;
}
