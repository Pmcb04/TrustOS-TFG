package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.trustos.Asset;
import com.mycompany.myapp.service.dto.trustos.AssetDTO;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Mapper for the entity {@link Asset} and its DTO called {@link AssetDTO}.
 *
 * Normal mappers are generated using MapStruct, this one is hand-coded as MapStruct
 * support is still in beta, and requires a manual step with an IDE.
 */
@Service
public class AssetMapper {

    public List<AssetDTO> assetsToAssetDTOs(List<Asset> assets) {
        return assets.stream().filter(Objects::nonNull).map(this::assetToAssetDTO).collect(Collectors.toList());
    }

    public Asset assetDTOToAsset(AssetDTO assetDto) {
        if (assetDto == null) {
            return null;
        } else {
            Asset asset = new Asset();
            asset.setAssetId(assetDto.getAssetId());
            asset.setData(assetDto.getData());
            asset.setMetadata(assetDto.getMetadata());
            return asset;
        }
    }

    public AssetDTO assetToAssetDTO(Asset asset) {
        return new AssetDTO(asset.getAssetId(), asset.getData(), asset.getMetadata());
    }

    public List<Asset> assetDTOsToAssets(List<AssetDTO> assetDTOs) {
        return assetDTOs.stream().filter(Objects::nonNull).map(this::assetDTOToAsset).collect(Collectors.toList());
    }
}
