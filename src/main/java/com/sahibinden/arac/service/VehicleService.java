package com.sahibinden.arac.service;

import com.sahibinden.arac.core.result.DataResult;
import com.sahibinden.arac.core.result.Result;
import com.sahibinden.arac.dto.requests.VehicleAddRequest;
import com.sahibinden.arac.dto.responses.VehicleListResponse;

import java.util.List;
import java.util.Optional;

public interface VehicleService {
    Result addVehicle(VehicleAddRequest vehicleAddRequest);
    DataResult<List<VehicleListResponse>> listVehicles(Optional<Integer> pageNum, Optional<Integer> pageSize);
    DataResult<VehicleListResponse> listSingleVehicle(Optional<Long> id);
}
